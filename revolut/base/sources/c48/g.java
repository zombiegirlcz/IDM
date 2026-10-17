package c48;

import a09.o;
import a48.h;
import a48.i;
import android.os.Looper;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.joint.impl.data.network.JointService;
import com.youTransactor.uCube.rpc.Constants;
import ix0.h1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import mp.r;
import n38.e0;
import n38.q;
import n38.t;
import n38.u;
import n38.v;
import n38.y;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements k38.d {

    @NotNull
    public static final c Companion = new c();
    public static final Type o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f21107p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b48.b f21109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m38.a f21110c;
    public final yf.c d;
    public final JointService e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f21111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y38.b f21112h;
    public final j48.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f21113j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f21114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f21115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f21116n;

    static {
        Type type = new TypeToken<a48.j>() { // from class: com.revolut.feature.joint.impl.data.repository.JointAccountsRepositoryImpl$Companion$INVITATIONS_STORAGE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        o = type;
        Type type2 = new TypeToken<h>() { // from class: com.revolut.feature.joint.impl.data.repository.JointAccountsRepositoryImpl$Companion$JOINT_PARTNER_LINKED_CARDS_STORAGE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f21107p = type2;
    }

    public g(r jointFeatureState, b48.b dtoToDomainMapper, m38.a relationshipMapper, yf.c domainToEntityMapper, JointService jointService, ue0.c storage, j memoryCache, y38.b jointAccountStore, j48.b jointProductcatalogLoader, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(jointFeatureState, "jointFeatureState");
        Intrinsics.checkNotNullParameter(dtoToDomainMapper, "dtoToDomainMapper");
        Intrinsics.checkNotNullParameter(relationshipMapper, "relationshipMapper");
        Intrinsics.checkNotNullParameter(domainToEntityMapper, "domainToEntityMapper");
        Intrinsics.checkNotNullParameter(jointService, "jointService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(jointAccountStore, "jointAccountStore");
        Intrinsics.checkNotNullParameter(jointProductcatalogLoader, "jointProductcatalogLoader");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f21108a = jointFeatureState;
        this.f21109b = dtoToDomainMapper;
        this.f21110c = relationshipMapper;
        this.d = domainToEntityMapper;
        this.e = jointService;
        this.f = storage;
        this.f21111g = memoryCache;
        this.f21112h = jointAccountStore;
        this.i = jointProductcatalogLoader;
        this.f21113j = featureToggleInteractor;
        final int i = 4;
        final int i2 = 4;
        final int i3 = 8;
        final int i5 = 5;
        final int i6 = 0;
        this.k = new w4l.f(new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i21 = i;
                int i22 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i21) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i22));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i22 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i21 = i2;
                g gVar = this.f21102b;
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        }, new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i21 = i3;
                int i22 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i21) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i22));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i22 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i21 = i5;
                g gVar = this.f21102b;
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        }, new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i21 = i6;
                int i22 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i21) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i22));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i22 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 1;
        Function2 function2 = new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i21;
                int i22 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i22));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i22 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i22 = 0;
        Function1 function1 = new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i212 = i22;
                g gVar = this.f21102b;
                switch (i212) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        };
        final int i32 = 2;
        Function2 function22 = new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i32;
                int i222 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i222));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i222 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 1;
        Function1 function12 = new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i212 = i33;
                g gVar = this.f21102b;
                switch (i212) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        };
        final int i43 = 3;
        this.f21114l = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i43;
                int i222 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i222));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i222 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i59 = 5;
        final int i66 = 2;
        final int i74 = 6;
        this.f21115m = new w4l.f(new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i59;
                int i222 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i222));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i222 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i212 = i66;
                g gVar = this.f21102b;
                switch (i212) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        }, new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i74;
                int i222 = 10;
                Continuation continuation = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i222));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i222 = 10;
                            continuation = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        Continuation continuation = null;
        final int i92 = 3;
        final int i96 = 7;
        this.f21116n = new x4l.c(new o(this, continuation, 23), new Function1(this) { // from class: c48.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21102b;

            {
                this.f21102b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                int i212 = i92;
                g gVar = this.f21102b;
                switch (i212) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return gVar.f21112h.a();
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        a48.b entity = (a48.b) bVar.f310686a.T2("JOINT_ACCOUNTS_CACHE_KEY", y38.b.f310685c);
                        if (entity == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        List<a48.a> accounts = entity.getAccounts();
                        ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                        for (a48.a aVar : accounts) {
                            String memberId = aVar.getMemberId();
                            String walletId = aVar.getWalletId();
                            String state = aVar.getState();
                            q qVar = state != null ? (q) u1.v(state, b48.c.a()) : null;
                            List<a48.e> members = aVar.getMembers();
                            ArrayList arrayList2 = new ArrayList(w.t(members, 10));
                            for (a48.e eVar : members) {
                                arrayList2.add(new y(eVar.getId(), eVar.getLegalName(), eVar.getFirstName(), eVar.getLastName(), eVar.getCode()));
                            }
                            arrayList.add(new n38.a(memberId, walletId, qVar, arrayList2));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (n38.r) gVar.f21111g.get("JOINT_USER_ELIGIBILITY_CACHE_KEY");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) gVar.f21111g.get("PARTNER_LINKED_CARDS_CACHE_KEY");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        return (List) gVar.f21111g.get("INVITATIONS_CACHE_KEY");
                    default:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        a48.j entity2 = (a48.j) gVar.f.T2("INVITATIONS_CACHE_KEY", g.o);
                        if (entity2 == null) {
                            return null;
                        }
                        yf.c cVar = gVar.d;
                        Intrinsics.checkNotNullParameter(entity2, "entity");
                        List<i> invitations = entity2.getInvitations();
                        ArrayList arrayList3 = new ArrayList(w.t(invitations, 10));
                        for (i iVar : invitations) {
                            String id10 = iVar.getId();
                            Object objV = u1.v(iVar.getState(), b48.c.c());
                            if (objV == null) {
                                throw new IllegalStateException("Unsupported state");
                            }
                            t tVar = (t) objV;
                            List<a48.d> users = iVar.getUsers();
                            ArrayList arrayList4 = new ArrayList(w.t(users, 10));
                            for (a48.d dVar : users) {
                                String name = dVar.getName();
                                String phone = dVar.getPhone();
                                Object objV2 = u1.v(dVar.getState(), b48.c.d());
                                if (objV2 == null) {
                                    throw new IllegalStateException("Unsupported state");
                                }
                                arrayList4.add(new u(name, phone, (n38.w) objV2));
                            }
                            Boolean isVulnerable = iVar.getIsVulnerable();
                            boolean zBooleanValue = isVulnerable != null ? isVulnerable.booleanValue() : false;
                            a48.c inviteDetail = iVar.getInviteDetail();
                            arrayList3.add(new e0(id10, iVar.getWorkflowId(), arrayList4, tVar, zBooleanValue, inviteDetail != null ? new v(((b48.d) ((m38.a) cVar.b)).a(inviteDetail.getRelationship()), inviteDetail.getPurposes()) : null, iVar.getExpiresAt()));
                        }
                        return arrayList3;
                }
            }
        }, new Function2(this) { // from class: c48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f21100b;

            {
                this.f21100b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                int i212 = i96;
                int i222 = 10;
                Continuation continuation2 = null;
                g gVar = this.f21100b;
                switch (i212) {
                    case 0:
                        List invitations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        ue0.c cVar = gVar.f;
                        yf.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(invitations, "invitations");
                        List<e0> list = invitations;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (e0 e0Var : list) {
                            String str = e0Var.f211945a;
                            String strG = u1.g(e0Var.d, b48.c.c());
                            ArrayList<u> arrayList2 = e0Var.f211947c;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            for (u uVar : arrayList2) {
                                arrayList3.add(new a48.d(uVar.f211959a, uVar.f211960b, u1.g(uVar.f211961c, b48.c.d())));
                            }
                            Boolean boolValueOf = Boolean.valueOf(e0Var.e);
                            v vVar = e0Var.f;
                            arrayList.add(new i(str, strG, arrayList3, boolValueOf, vVar != null ? new a48.c(vVar.f211963b, ((b48.d) ((m38.a) cVar2.b)).b(vVar.f211962a)) : null, e0Var.f211948g, e0Var.f211946b));
                        }
                        cVar.G(new a48.j(arrayList), "INVITATIONS_CACHE_KEY", z.d(o0.b(a48.j.class)));
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (((y91.b) gVar.f21108a.f207713b).c()) {
                        }
                        break;
                    case 2:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        y38.b bVar = gVar.f21112h;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        bVar.f310687b.f("JOINT_ACCOUNTS_CACHE_KEY", accounts);
                        break;
                    case 3:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        y38.b bVar2 = gVar.f21112h;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<n38.a> list2 = accounts2;
                        ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                        for (n38.a aVar : list2) {
                            String str2 = aVar.f211923a;
                            String str3 = aVar.f211924b;
                            q qVar = aVar.f211925c;
                            String strG2 = qVar != null ? u1.g(qVar, b48.c.a()) : continuation2;
                            ArrayList<y> arrayList5 = aVar.d;
                            ArrayList arrayList6 = new ArrayList(w.t(arrayList5, i222));
                            for (y yVar : arrayList5) {
                                arrayList6.add(new a48.e(yVar.f211967a, yVar.f211968b, yVar.f211969c, yVar.d, yVar.e));
                            }
                            arrayList4.add(new a48.a(str2, str3, strG2, arrayList6));
                            i222 = 10;
                            continuation2 = null;
                        }
                        a48.b entity = new a48.b(arrayList4);
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(entity, "entity");
                        Lazy lazy = h1.f169241a;
                        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
                            hx7.e.n(new IllegalThreadStateException("Access to storage on main thread is not allowed"));
                        }
                        bVar2.f310686a.G(entity, "JOINT_ACCOUNTS_CACHE_KEY", z.d(o0.b(a48.b.class)));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                    case 5:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it10 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new e(gVar, continuation2, 1)), new c2i.c(new bwc.i(1, gVar.f21109b, b48.b.class, "mapToJointEligibility", "mapToJointEligibility(Lcom/revolut/feature/joint/impl/data/dto/JointEligibilityDto;)Lcom/revolut/feature/joint/api/models/JointEligibility;", 0, 2), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 6:
                        n38.r userEligibility = (n38.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(userEligibility, "userEligibility");
                        gVar.f21111g.f("JOINT_USER_ELIGIBILITY_CACHE_KEY", userEligibility);
                        break;
                    case 7:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        gVar.f21111g.f("PARTNER_LINKED_CARDS_CACHE_KEY", cards);
                        break;
                    default:
                        List invitations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(invitations2, "invitations");
                        gVar.f21111g.f("INVITATIONS_CACHE_KEY", invitations2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new brc.h(this, continuation, 28), new awd.b(this, continuation, 15));
    }
}
