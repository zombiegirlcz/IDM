package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.internal.lz;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes23.dex */
public final class ha0 implements lz {
    private static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f29190g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ib0 f29193c;
    private final jx d;
    private final Function3 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29196c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29197g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f29198h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f29199j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f29200l;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29199j = obj2;
            this.f29200l |= Integer.MIN_VALUE;
            Object objA = ha0.this.a((lz.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ha0(Context context, Function0 workflowIdProvider, ib0 networkService, jx featuresAnalyticsContext, Function3 flowVariantUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(featuresAnalyticsContext, "featuresAnalyticsContext");
        Intrinsics.checkNotNullParameter(flowVariantUseCase, "flowVariantUseCase");
        this.f29191a = context;
        this.f29192b = workflowIdProvider;
        this.f29193c = networkService;
        this.d = featuresAnalyticsContext;
        this.e = flowVariantUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.fourthline.orca.internal.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.lz.a r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ha0.a(com.fourthline.orca.internal.lz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ny a(JsonElement jsonElement, String str) {
        switch (str.hashCode()) {
            case -1748366661:
                if (str.equals("biometrics")) {
                    return (ny) s40.a().a(n01.INSTANCE.serializer(), jsonElement);
                }
                break;
            case -1147692044:
                if (str.equals("address")) {
                    return (ny) s40.a().a(n0.INSTANCE.serializer(), jsonElement);
                }
                break;
            case -991716523:
                if (str.equals("person")) {
                    return (ny) s40.a().a(dk0.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 97303:
                if (str.equals("bav")) {
                    return (ny) s40.a().a(c4.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 100416:
                if (str.equals("eid")) {
                    return (ny) s40.a().a(us.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 111170:
                if (str.equals("poa")) {
                    return (ny) s40.a().a(an0.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 111839:
                if (str.equals("qes")) {
                    return (ny) s40.a().a(it0.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 114841:
                if (str.equals("tin")) {
                    return (ny) s40.a().a(j91.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 66670086:
                if (str.equals("geolocation")) {
                    return (ny) s40.a().a(e60.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 861720859:
                if (str.equals("document")) {
                    return (ny) s40.a().a(dj.INSTANCE.serializer(), jsonElement);
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    return (ny) s40.a().a(cc.INSTANCE.serializer(), jsonElement);
                }
                break;
        }
        throw new IllegalStateException(("FL developer error. Config for Flow '" + str + "' is missing.").toString());
    }
}
