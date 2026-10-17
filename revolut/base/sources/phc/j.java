package phc;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.rewards.impl.data.network.services.RewardsService;
import do3.t;
import java.lang.reflect.Type;
import java.util.List;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o29.l;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pfk.o0;
import pfk.q;
import rgc.p;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f236266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Type f236267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final rgc.b f236268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Type f236269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Type f236270t;
    public static final Type u;
    public static final Type v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f236271w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardsService f236272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pgc.g f236273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pgc.d f236274c;
    public final pgc.a d;
    public final ue0.c e;
    public final ne0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f236275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f236276h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f236277j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f236278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f236279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f236280n;
    public final x4l.c o;

    static {
        Type type = new TypeToken<Boolean>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$BOOLEAN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f236266p = type;
        Type type2 = new TypeToken<rgc.b>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$COLLECTIONS_INFO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f236267q = type2;
        f236268r = new rgc.b();
        Type type3 = new TypeToken<rhc.c>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$REWARD_OPTIONAL_OUTLET_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        f236269s = type3;
        Type type4 = new TypeToken<List<? extends p>>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$REWARDS_PREVIEWS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        f236270t = type4;
        Type type5 = new TypeToken<List<? extends ehc.i>>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$PERK_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
        u = type5;
        Type type6 = new TypeToken<List<? extends ahc.d>>() { // from class: com.revolut.feature.rewards.impl.data.repository.rewards.RewardsRepositoryImpl$Companion$PERK_CATEGORIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
        v = type6;
        f236271w = u.c("PREMIUM_PARTNERSHIP");
    }

    public j(RewardsService rewardsService, pgc.g rewardsDao, pgc.d rewardCollectionsDao, pgc.a rewardCategoriesDao, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(rewardsService, "rewardsService");
        Intrinsics.checkNotNullParameter(rewardsDao, "rewardsDao");
        Intrinsics.checkNotNullParameter(rewardCollectionsDao, "rewardCollectionsDao");
        Intrinsics.checkNotNullParameter(rewardCategoriesDao, "rewardCategoriesDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f236272a = rewardsService;
        this.f236273b = rewardsDao;
        this.f236274c = rewardCollectionsDao;
        this.d = rewardCategoriesDao;
        this.e = storage;
        this.f = memoryCache;
        final int i = 0;
        final int i2 = 13;
        final int i3 = 19;
        this.f236275g = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 5), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 14), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 20;
        final int i6 = 21;
        final int i21 = 22;
        this.f236276h = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 15), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 16), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function2 = new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        c cVar = new c(this, i22);
        final int i32 = 2;
        Function2 function22 = new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        };
        c cVar2 = new c(this, i32);
        final int i33 = 3;
        this.i = new w4l.f(function2, cVar, function22, cVar2, new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        final int i59 = 5;
        final int i66 = 6;
        this.f236277j = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 3), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 4), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 7;
        final int i92 = 8;
        final int i96 = 9;
        this.k = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 6), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 7), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i99 = 10;
        final int i100 = 11;
        final int i101 = 12;
        this.f236278l = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 8), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 9), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        final int i102 = 14;
        final int i103 = 15;
        final int i104 = 16;
        this.f236279m = new w4l.f(new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 10), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new c(this, 11), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i105 = 17;
        int i106 = 5;
        this.f236280n = new x4l.c(new l(this, continuation, 23), new c(this, 12), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new o0(this, continuation, 2), new q(this, continuation, i106));
        final int i107 = 18;
        this.o = new x4l.c(new k(this, continuation, 27), new c(this, 13), new Function2(this) { // from class: phc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f236260b;

            {
                this.f236260b = this;
            }

            /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 rgc.m, still in use, count: 2, list:
                  (r5v2 rgc.m) from 0x060d: MOVE (r29v2 rgc.m) = (r5v2 rgc.m)
                  (r5v2 rgc.m) from 0x05fc: MOVE (r29v4 rgc.m) = (r5v2 rgc.m)
                */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 2244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: phc.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, new p0l.d(this, continuation, 23), new p24.q(this, continuation, i106));
    }

    public static String a(h hVar) {
        return p.a.p("CACHE_KEY_PERKS", hVar.f236261a, hVar.f236262b);
    }

    public static String b(i iVar) {
        String strName;
        StringBuilder sb6 = new StringBuilder("REWARDS_PREVIEW_CACHE_KEY_V2_plan=");
        sb6.append(iVar.f236263a);
        sb6.append("|user=");
        sb6.append(iVar.f236264b);
        sb6.append("|student=");
        t tVar = iVar.f236265c;
        if (tVar == null || (strName = tVar.name()) == null) {
            strName = "NONE";
        }
        sb6.append(strName);
        return sb6.toString();
    }

    @Override // od0.e
    public final void clear() {
        this.f.clear();
        this.e.clear();
    }
}
