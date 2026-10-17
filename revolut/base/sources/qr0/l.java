package qr0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qgf.o;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GalleryPickerView f248596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f248597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f248598c;
    public h d;
    public final LinkedHashMap e;
    public final ArrayList f;

    public l(GalleryPickerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f248596a = recyclerView;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f248597b = new g(context);
        this.f248598c = new Handler(Looper.getMainLooper());
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        recyclerView.setIdleListener$ui_kit_components_release(new i(this, 0));
        recyclerView.setOnViewRecycledListener$ui_kit_components_release(new o(this, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qr0.l.a():void");
    }
}
