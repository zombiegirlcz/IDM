package nem;

import java.util.List;
import kem.i;
import kem.l;
import kem.t;
import kem.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import yhm.k;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f214643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f214644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f214645c;
    public final Object d;

    public g(Function0 function0, t tVar) {
        this.f214643a = function0;
        this.f214644b = tVar;
        k kVar = k.NONE;
        final int i = 0;
        this.f214645c = j.c(kVar, new Function0(this) { // from class: nem.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f214642b;

            {
                this.f214642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                g gVar = this.f214642b;
                switch (i2) {
                    case 0:
                        t tVar2 = gVar.f214644b;
                        List list = u.f183239a;
                        String value = tVar2.get("Content-Disposition");
                        if (value == null) {
                            return null;
                        }
                        kem.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        l lVar = (l) d0.m0(a1m.e.C(value));
                        return new kem.d(lVar.f183211a, lVar.f183212b);
                    default:
                        t tVar3 = gVar.f214644b;
                        List list2 = u.f183239a;
                        String str = tVar3.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return kem.f.a(str);
                }
            }
        });
        final int i2 = 1;
        this.d = j.c(kVar, new Function0(this) { // from class: nem.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f214642b;

            {
                this.f214642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                g gVar = this.f214642b;
                switch (i22) {
                    case 0:
                        t tVar2 = gVar.f214644b;
                        List list = u.f183239a;
                        String value = tVar2.get("Content-Disposition");
                        if (value == null) {
                            return null;
                        }
                        kem.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        l lVar = (l) d0.m0(a1m.e.C(value));
                        return new kem.d(lVar.f183211a, lVar.f183212b);
                    default:
                        t tVar3 = gVar.f214644b;
                        List list2 = u.f183239a;
                        String str = tVar3.get("Content-Type");
                        if (str == null) {
                            return null;
                        }
                        i.Companion.getClass();
                        return kem.f.a(str);
                }
            }
        });
    }
}
