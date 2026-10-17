package oyl;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import com.revolut.ui_kit_pdf.PdfView;
import com.revolut.ui_kit_pdf.R$id;
import com.revolut.ui_kit_pdf.viewer.PdfRendererException;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import jo0.g;
import kl.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kyl.i;
import kyl.j;
import org.jetbrains.annotations.NotNull;
import oxd.m;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements Closeable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdfView f231060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f231061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f231062c;
    public final nyl.b d;
    public final TextView e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f231063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final File f231064h;
    public final e i;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public f(PdfView rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f231060a = rootView;
        this.f231062c = new m(this, 8);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nyl.b bVar = new nyl.b(context, null, 6, 0);
        bVar.setId(R$id.internal_pdf_renderer_recycler_view);
        bVar.setTag("INTERNAL_PDF_RENDERER_RECYCLER_VIEW");
        this.d = bVar;
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextView textView = new TextView(context2);
        textView.setText("0 / 0");
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        textView.setMinWidth(kli.a.k(context2, 48.0f));
        textView.setPadding(kli.a.k(context2, 4.0f), kli.a.k(context2, 4.0f), kli.a.k(context2, 4.0f), kli.a.k(context2, 4.0f));
        float fK = kli.a.k(context2, 4.0f);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = fK;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(268435456);
        textView.setBackground(shapeDrawable);
        textView.setVisibility(0);
        this.e = textView;
        this.f = true;
        this.f231063g = new c(this, 0);
        this.f231064h = new File(this.f231060a.getContext().getCacheDir(), "pdf_renderer_cache");
        PdfView pdfView = this.f231060a;
        Context context3 = pdfView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK = kli.a.k(context3, 16.0f);
        pdfView.removeAllViews();
        pdfView.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        layoutParams.topMargin = iK;
        layoutParams.bottomMargin = iK;
        Unit unit = Unit.f186387a;
        pdfView.addView(textView, layoutParams);
        if (((Boolean) g.f176835s.getValue()).booleanValue()) {
            this.d.setClipToPadding(false);
            ViewCompat.setOnApplyWindowInsetsListener(pdfView, new com.google.android.material.sidesheet.c(this, iK, 4));
            pdfView.requestApplyInsets();
        }
        this.i = new e(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.setAdapter(null);
    }

    public final void d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            f(file);
        } catch (Exception e) {
            this.f231062c.invoke(new PdfRendererException("Unknown PdfRenderer exception", e));
        }
    }

    public final void f(File file) {
        boolean zExists = file.exists();
        m mVar = this.f231062c;
        if (!zExists && !file.canRead()) {
            mVar.invoke(new PdfRendererException("File doesn't exist or is unavailable", new FileNotFoundException(file.getPath())));
            return;
        }
        File file2 = this.f231064h;
        b bVar = new b(file, new fl1.c(file, new i(file2), new j(0), new c0(file2)), mVar);
        nyl.b bVar2 = this.d;
        bVar2.setAdapter(bVar);
        bVar2.addOnScrollListener(this.i);
        bVar2.addItemDecoration(new DividerItemDecoration(this.f231060a.getContext(), 0));
        this.e.setVisibility(4);
    }
}
