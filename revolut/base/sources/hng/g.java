package hng;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.user.impl.network.service.UserService;
import efm.d0;
import efm.r;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserService f154100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f154101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f154102c;
    public final w4l.f d;

    public g(UserService userService, ne0.j memoryCache, ue0.c userCompanyStorage) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(userCompanyStorage, "userCompanyStorage");
        this.f154100a = userService;
        this.f154101b = memoryCache;
        this.f154102c = userCompanyStorage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: hng.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f154096b;

            {
                this.f154096b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<dng.g> userCompany = this.f154096b.f154100a.getUserCompany();
                        hje.e eVar = new hje.e(new hmc.a(12), 12);
                        userCompany.getClass();
                        ufm.i iVar = new ufm.i(userCompany, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l71.d userCompany2 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany2, "userCompany");
                        this.f154096b.f154101b.f("USER_COMPANY_STORAGE_KEY", userCompany2);
                        break;
                    default:
                        l71.d userCompany3 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany3, "userCompany");
                        ue0.c cVar = this.f154096b.f154102c;
                        Intrinsics.checkNotNullParameter(userCompany3, "<this>");
                        cVar.G(new jng.i(userCompany3.f192498a, userCompany3.f192499b, userCompany3.f192500c), "USER_COMPANY_STORAGE_KEY", z.d(o0.b(jng.i.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: hng.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f154098b;

            {
                this.f154098b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (l71.d) this.f154098b.f154101b.get("USER_COMPANY_STORAGE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f154098b.f154102c;
                        Type type = new TypeToken<jng.i>() { // from class: com.revolut.feature.user.impl.repository.impl.UserCompanyRepositoryImpl$userCompanyDelegate$4$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        jng.i iVar = (jng.i) cVar.T2("USER_COMPANY_STORAGE_KEY", type);
                        if (iVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new l71.d(iVar.getName(), iVar.getFeatures(), iVar.getRegion());
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: hng.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f154096b;

            {
                this.f154096b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<dng.g> userCompany = this.f154096b.f154100a.getUserCompany();
                        hje.e eVar = new hje.e(new hmc.a(12), 12);
                        userCompany.getClass();
                        ufm.i iVar = new ufm.i(userCompany, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l71.d userCompany2 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany2, "userCompany");
                        this.f154096b.f154101b.f("USER_COMPANY_STORAGE_KEY", userCompany2);
                        break;
                    default:
                        l71.d userCompany3 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany3, "userCompany");
                        ue0.c cVar = this.f154096b.f154102c;
                        Intrinsics.checkNotNullParameter(userCompany3, "<this>");
                        cVar.G(new jng.i(userCompany3.f192498a, userCompany3.f192499b, userCompany3.f192500c), "USER_COMPANY_STORAGE_KEY", z.d(o0.b(jng.i.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: hng.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f154098b;

            {
                this.f154098b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (l71.d) this.f154098b.f154101b.get("USER_COMPANY_STORAGE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ue0.c cVar = this.f154098b.f154102c;
                        Type type = new TypeToken<jng.i>() { // from class: com.revolut.feature.user.impl.repository.impl.UserCompanyRepositoryImpl$userCompanyDelegate$4$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        jng.i iVar = (jng.i) cVar.T2("USER_COMPANY_STORAGE_KEY", type);
                        if (iVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new l71.d(iVar.getName(), iVar.getFeatures(), iVar.getRegion());
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: hng.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f154096b;

            {
                this.f154096b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<dng.g> userCompany = this.f154096b.f154100a.getUserCompany();
                        hje.e eVar = new hje.e(new hmc.a(12), 12);
                        userCompany.getClass();
                        ufm.i iVar = new ufm.i(userCompany, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        l71.d userCompany2 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany2, "userCompany");
                        this.f154096b.f154101b.f("USER_COMPANY_STORAGE_KEY", userCompany2);
                        break;
                    default:
                        l71.d userCompany3 = (l71.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userCompany3, "userCompany");
                        ue0.c cVar = this.f154096b.f154102c;
                        Intrinsics.checkNotNullParameter(userCompany3, "<this>");
                        cVar.G(new jng.i(userCompany3.f192498a, userCompany3.f192499b, userCompany3.f192500c), "USER_COMPANY_STORAGE_KEY", z.d(o0.b(jng.i.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static r b(g gVar) {
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.d.e(Unit.f186387a, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(w4l.k r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hng.f
            if (r0 == 0) goto L13
            r0 = r7
            hng.f r0 = (hng.f) r0
            int r1 = r0.f154099w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154099w = r1
            goto L18
        L13:
            hng.f r0 = new hng.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154099w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            w4l.f r7 = r5.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            efm.r r6 = r7.e(r2, r6)
            hmc.a r7 = new hmc.a
            r2 = 13
            r7.<init>(r2)
            hje.e r2 = new hje.e
            r4 = 13
            r2.<init>(r7, r4)
            efm.r r6 = r6.filter(r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f154099w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r6 = r7.component1()
            l71.d r6 = (l71.d) r6
            java.lang.Throwable r7 = r7.getError()
            if (r6 != 0) goto L70
            if (r7 != 0) goto L6f
            goto L70
        L6f:
            throw r7
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hng.g.a(w4l.k, gim.c):java.lang.Object");
    }
}
