package aae;

import ip0.vd;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd f2810b;

    public /* synthetic */ e(vd vdVar, int i) {
        this.f2809a = i;
        this.f2810b = vdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f2809a) {
            case 0:
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return c.a(update, this.f2810b.f166807b);
            case 1:
                avi.c update2 = (avi.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return new avi.c(this.f2810b.f166807b, update2.f10042b);
            case 2:
                bvj.a update3 = (bvj.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                LocalDate localDate = this.f2810b.f166807b;
                update3.getClass();
                return new bvj.a(localDate);
            default:
                ech.d updateState = (ech.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ech.d.a(updateState, this.f2810b.f166807b, null, 2);
        }
    }
}
