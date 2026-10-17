package lri;

import android.view.MotionEvent;
import fsi.c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om0.b f199521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(om0.b inactivityTimer) {
        super(new fsi.b("INACTIVITY_ACTIVITY_DELEGATE"));
        Intrinsics.checkNotNullParameter(inactivityTimer, "inactivityTimer");
        this.f199521h = inactivityTimer;
    }

    @Override // fsi.a
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        om0.b bVar = this.f199521h;
        bVar.f226492c.init();
        bVar.f226490a.onNext(Unit.f186387a);
        return false;
    }

    @Override // fsi.a
    public final void onResume() {
        om0.b bVar = this.f199521h;
        bVar.f226492c.init();
        bVar.f226490a.onNext(Unit.f186387a);
    }
}
