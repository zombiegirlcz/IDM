package pn5;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;
import kn5.d;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import rn5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f237664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f237665b;

    public a(b defaultAddressValidator, ImmutableMap validators) {
        Intrinsics.checkNotNullParameter(defaultAddressValidator, "defaultAddressValidator");
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f237664a = defaultAddressValidator;
        this.f237665b = validators;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final wk5.a a(String address, boolean z) {
        wk5.a aVar;
        Intrinsics.checkNotNullParameter(address, "address");
        Iterator it8 = this.f237665b.entrySet().iterator();
        do {
            aVar = null;
            if (!it8.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it8.next();
            String str = (String) entry.getKey();
            rn5.a aVar2 = (rn5.a) entry.getValue();
            wk5.a aVar3 = (wk5.a) u1.v(str, wk5.b.f298250a);
            if (aVar3 == null) {
                aVar3 = wk5.a.UNSPECIFIED;
            }
            if (aVar2.a(new kn5.a(address, aVar3, z)) instanceof d) {
                aVar = aVar3;
            }
        } while (aVar == null);
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final f b(kn5.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.f185996a.length() == 0) {
            return new e(h.f186003a);
        }
        rn5.a aVar = (rn5.a) this.f237665b.get(u1.h(params.f185997b, wk5.b.f298250a));
        if (aVar == null) {
            aVar = this.f237664a;
        }
        return aVar.a(params);
    }
}
