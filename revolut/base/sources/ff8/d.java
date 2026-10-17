package ff8;

import akl.t;
import ald.p;
import ald.q;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior_core.impl.services.JuniorAccountService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f134767g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountService f134768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f134769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f134770c;
    public final x4l.c d;
    public final ao.h e;
    public final ao.h f;

    static {
        Type type = new TypeToken<List<? extends bf8.b>>() { // from class: com.revolut.feature.junior_core.impl.repositories.JuniorAccountRepositoryImpl$Companion$JUNIOR_LIST_KYC_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f134767g = type;
    }

    public d(JuniorAccountService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f134768a = service;
        this.f134769b = memoryCache;
        this.f134770c = storage;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        this.d = new x4l.c(new ald.n(this, continuation, 4), new Function1(this) { // from class: ff8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f134766b;

            {
                this.f134766b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String registeredIdentityId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        return (List) this.f134766b.f134769b.get(c.a(d.Companion, registeredIdentityId));
                    case 1:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD = this.f134766b.f134768a.closeAccount(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    default:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD2 = this.f134766b.f134768a.cancelClosureRequest(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                        return zVarD2;
                }
            }
        }, new t(this, 3), new p(this, continuation, i2), new q(this, continuation, i2));
        final int i3 = 1;
        this.e = new ao.h(20, new Function1(this) { // from class: ff8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f134766b;

            {
                this.f134766b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String registeredIdentityId = (String) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        return (List) this.f134766b.f134769b.get(c.a(d.Companion, registeredIdentityId));
                    case 1:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD = this.f134766b.f134768a.closeAccount(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    default:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD2 = this.f134766b.f134768a.cancelClosureRequest(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                        return zVarD2;
                }
            }
        });
        final int i5 = 2;
        this.f = new ao.h(20, new Function1(this) { // from class: ff8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f134766b;

            {
                this.f134766b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String registeredIdentityId = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        return (List) this.f134766b.f134769b.get(c.a(d.Companion, registeredIdentityId));
                    case 1:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD = this.f134766b.f134768a.closeAccount(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                    default:
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "juniorId");
                        z zVarD2 = this.f134766b.f134768a.cancelClosureRequest(registeredIdentityId).D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                        return zVarD2;
                }
            }
        });
    }
}
