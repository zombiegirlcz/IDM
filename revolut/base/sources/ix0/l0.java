package ix0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    @NotNull
    public static final e0 Companion = new e0();
    public static final Paint e;
    public static final Path f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f169257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f169258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f169259c;
    public boolean d;

    static {
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        e = paintC;
        f = new Path();
    }

    public l0(ViewGroup containerLayout, List cutoutReceivers) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        Intrinsics.checkNotNullParameter(cutoutReceivers, "cutoutReceivers");
        this.f169257a = containerLayout;
        this.f169258b = cutoutReceivers;
        this.f169259c = new ArrayList();
    }

    public final void a(g0 cutoutProvider) {
        Intrinsics.checkNotNullParameter(cutoutProvider, "cutoutProvider");
        if (!this.d && !this.f169258b.isEmpty()) {
            this.d = true;
            this.f169257a.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 13));
        }
        ArrayList arrayList = this.f169259c;
        if (arrayList.contains(cutoutProvider)) {
            return;
        }
        arrayList.add(cutoutProvider);
    }
}
