package com.fourthline.orca.internal;

import androidx.content.NavDestination;
import androidx.content.NavGraphBuilder;
import androidx.content.NavHostController;
import com.fourthline.orca.internal.q80;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bj0 f30615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f30616b;

    public lg0(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        this.f30615a = orcaSubcomponent;
        this.f30616b = new ArrayList();
    }

    public final mh0 a() {
        return (mh0) zhm.d0.o0(this.f30616b);
    }

    public final boolean b(mh0 flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        bj0 bj0Var = this.f30615a;
        NavDestination navDestinationFindNode = bj0Var.o().getGraph().findNode(flow.e());
        if (navDestinationFindNode != null) {
            bj0Var.o().getGraph().remove(navDestinationFindNode);
        }
        return this.f30616b.remove(flow);
    }

    public final mh0 a(ny flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        mh0 mh0VarA = a();
        if (Intrinsics.f(mh0VarA != null ? mh0VarA.d() : null, flowConfig)) {
            return a();
        }
        mh0 mh0VarA2 = a(this.f30615a, flowConfig);
        if (mh0VarA2 == null) {
            return null;
        }
        this.f30616b.add(mh0VarA2);
        return mh0VarA2;
    }

    public final mh0 a(q80 q80Var) {
        if (q80Var instanceof q80.i) {
            while (!this.f30616b.isEmpty() && !(zhm.d0.m0(this.f30616b) instanceof ep)) {
                b((mh0) zhm.d0.m0(this.f30616b));
            }
        } else {
            b((mh0) zhm.d0.m0(this.f30616b));
        }
        return (mh0) zhm.d0.o0(this.f30616b);
    }

    public final void a(mh0 flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        bj0 bj0Var = this.f30615a;
        if (bj0Var.o().getGraph().findNode(flow.e()) != null) {
            return;
        }
        NavHostController navHostControllerO = bj0Var.o();
        String strE = flow.e();
        String strC = flow.b().b().c();
        Function1 function1C = flow.c();
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostControllerO.getNavigatorProvider(), strC, strE);
        function1C.invoke(navGraphBuilder);
        bj0Var.o().getGraph().addDestination(navGraphBuilder.build());
    }

    private final mh0 a(bj0 bj0Var, ny nyVar) {
        mh0 mh0VarA;
        try {
            mh0VarA = nyVar.a();
        } catch (NotImplementedError unused) {
            mh0VarA = null;
        }
        if (mh0VarA != null) {
            mh0VarA.a(bj0Var);
        }
        return mh0VarA;
    }
}
