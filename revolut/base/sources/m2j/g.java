package m2j;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ efm.p f202034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f202035c;

    public /* synthetic */ g(efm.p pVar, Ref$BooleanRef ref$BooleanRef, int i) {
        this.f202033a = i;
        this.f202034b = pVar;
        this.f202035c = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202033a) {
            case 0:
                efm.p notification = (efm.p) obj2;
                Intrinsics.checkNotNullParameter(notification, "notification");
                efm.p pVar = this.f202034b;
                Ref$BooleanRef ref$BooleanRef = this.f202035c;
                boolean z = true;
                if (notification == pVar) {
                    if (ref$BooleanRef.f186407a) {
                        z = false;
                    }
                } else if (notification.d()) {
                    ref$BooleanRef.f186407a = true;
                }
                return Boolean.valueOf(z);
            case 1:
                efm.p notification2 = (efm.p) obj2;
                Intrinsics.checkNotNullParameter(notification2, "notification");
                efm.p pVar2 = this.f202034b;
                Ref$BooleanRef ref$BooleanRef2 = this.f202035c;
                boolean z3 = true;
                if (notification2 == pVar2) {
                    if (ref$BooleanRef2.f186407a) {
                        z3 = false;
                    }
                } else if (notification2.d()) {
                    ref$BooleanRef2.f186407a = true;
                }
                return Boolean.valueOf(z3);
            case 2:
                efm.p notification3 = (efm.p) obj2;
                Intrinsics.checkNotNullParameter(notification3, "notification");
                efm.p pVar3 = this.f202034b;
                Ref$BooleanRef ref$BooleanRef3 = this.f202035c;
                boolean z4 = true;
                if (notification3 == pVar3) {
                    if (ref$BooleanRef3.f186407a) {
                        z4 = false;
                    }
                } else if (notification3.d()) {
                    ref$BooleanRef3.f186407a = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                efm.p notification4 = (efm.p) obj2;
                Intrinsics.checkNotNullParameter(notification4, "notification");
                efm.p pVar4 = this.f202034b;
                Ref$BooleanRef ref$BooleanRef4 = this.f202035c;
                boolean z6 = true;
                if (notification4 == pVar4) {
                    if (ref$BooleanRef4.f186407a) {
                        z6 = false;
                    }
                } else if (notification4.d()) {
                    ref$BooleanRef4.f186407a = true;
                }
                return Boolean.valueOf(z6);
            default:
                efm.p notification5 = (efm.p) obj2;
                Intrinsics.checkNotNullParameter(notification5, "notification");
                efm.p pVar5 = this.f202034b;
                Ref$BooleanRef ref$BooleanRef5 = this.f202035c;
                boolean z11 = true;
                if (notification5 == pVar5) {
                    if (ref$BooleanRef5.f186407a) {
                        z11 = false;
                    }
                } else if (notification5.d()) {
                    ref$BooleanRef5.f186407a = true;
                }
                return Boolean.valueOf(z11);
        }
    }
}
