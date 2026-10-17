package aob;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import djb.k;
import djb.l;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f7962b;

    public /* synthetic */ e(k kVar, int i) {
        this.f7961a = i;
        this.f7962b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map profiles = (Map) obj2;
        switch (this.f7961a) {
            case 0:
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                od0.h hVar = od0.i.Companion;
                String value = ((l) this.f7962b).f115283a;
                Intrinsics.checkNotNullParameter(value, "value");
                Object obj3 = profiles.get(new RegisteredIdentityId(value));
                hVar.getClass();
                return od0.h.a(obj3);
            default:
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                od0.h hVar2 = od0.i.Companion;
                String value2 = ((l) this.f7962b).f115283a;
                Intrinsics.checkNotNullParameter(value2, "value");
                Object obj4 = profiles.get(new RegisteredIdentityId(value2));
                hVar2.getClass();
                return od0.h.a(obj4);
        }
    }
}
