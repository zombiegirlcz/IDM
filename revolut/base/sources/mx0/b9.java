package mx0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b9 extends View {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f209609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f209610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f209611c;
    public final Path d;
    public final float e;
    public final mr0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lr0.e f209612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209613h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f209614j;
    public final Matrix k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearGradient f209615l;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b9(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(Path path, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41) {
        float f42 = f37 * f32;
        float f57 = f + f42;
        float f69 = f41 * f32;
        float f75 = f4 + f69;
        float f77 = f - (f35 * f32);
        float f81 = f4 - (f36 * f32);
        float f82 = f - f42;
        float f93 = f4 - f69;
        float f94 = 0.5522848f * f32;
        path.rewind();
        path.moveTo(f5, f6);
        path.lineTo(f57, f75);
        float f99 = f35 * f94;
        float f100 = f57 - f99;
        float f101 = f36 * f94;
        float f102 = f37 * f94;
        float f103 = f41 * f94;
        path.cubicTo(f100, f75 - f101, f77 + f102, f81 + f103, f77, f81);
        path.cubicTo(f77 - f102, f81 - f103, f82 - f99, f93 - f101, f82, f93);
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.f209609a;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f209612g.d(canvas, this.f, f, this.f209615l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Path path = new Path();
        this.f209610b = path;
        Path path2 = new Path();
        this.f209611c = path2;
        Path path3 = new Path();
        this.d = path3;
        this.e = kli.a.l(context, 3.0f) / 2.0f;
        mr0.c cVar = new mr0.c(path, path2, path3);
        this.f = cVar;
        kr0.c cVarS = i2b.a.s(context);
        lr0.e eVarA = lr0.f.a(context, cVar, cVarS);
        this.f209612g = eVarA;
        this.f209613h = eVarA.b();
        this.i = eVarA.a() / 2.0f;
        this.f209614j = eVarA.c() / 2.0f;
        this.k = new Matrix();
        int i2 = cVarS.f188627a;
        this.f209615l = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, new int[]{0, i2, i2}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
        setImportantForAccessibility(2);
    }

    public /* synthetic */ b9(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
