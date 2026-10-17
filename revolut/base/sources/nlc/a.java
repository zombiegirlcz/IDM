package nlc;

import cam.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import nl0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f217112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d cache, int i) {
        super(cache);
        this.f217112b = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(cache, "cache");
                super(cache);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(cache, "cache");
                super(cache);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(cache, "cache");
                super(cache);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(cache, "cache");
                super(cache);
                break;
            default:
                Intrinsics.checkNotNullParameter(cache, "cache");
                break;
        }
    }

    @Override // cam.f
    public final Function1 n() {
        switch (this.f217112b) {
            case 0:
                return new c(20);
            case 1:
                return new c(21);
            case 2:
                return new c(22);
            case 3:
                return new c(23);
            default:
                return new c(24);
        }
    }
}
