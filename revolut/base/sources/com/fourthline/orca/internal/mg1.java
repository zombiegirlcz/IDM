package com.fourthline.orca.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31188a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final ib0 a(ib0 publicNetworkService, Function0 tokenProvider, sg0 tracker) {
        Intrinsics.checkNotNullParameter(publicNetworkService, "publicNetworkService");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return q1.a(new i2(publicNetworkService, tokenProvider), tracker);
    }

    public final ib0 b(mb.d networkEnvironment) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        ib0 ib0VarA = jb0.a(a(networkEnvironment), networkEnvironment);
        ib.h hVar = hb.a.f150532a;
        return ib0VarA;
    }

    public final kb0 a(final mb.d networkEnvironment, final sg0 tracker) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new kb0() { // from class: com.fourthline.orca.internal.up1
            @Override // com.fourthline.orca.internal.kb0, kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mg1.b(networkEnvironment, tracker);
            }
        };
    }

    public final ib0 b(ib0 publicNetworkService, Function0 tokenProvider, sg0 tracker) {
        Intrinsics.checkNotNullParameter(publicNetworkService, "publicNetworkService");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return q1.a(new i2(publicNetworkService, tokenProvider), tracker);
    }

    private final String a(mb.d dVar) {
        if (dVar instanceof mb.b) {
            return "https://mapi.ext.fourthline.com/";
        }
        if (dVar instanceof mb.c) {
            return "https://mapi.ext-sandbox.fourthline.com/";
        }
        if (dVar instanceof mb.a) {
            return "stub";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ib0 b(mb.d dVar, sg0 sg0Var) {
        return q1.a(jb0.a(ng1.a(dVar), dVar), sg0Var);
    }
}
