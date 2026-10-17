package pii;

import aii.u;
import android.content.Context;
import com.revolut.kompot.FeatureFlowStep;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.feature_handler.AdapterDestination;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nhi.c;
import nhi.f;
import ohi.b;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements f, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f236523a;

    public a(b featureHandlerDelegate) {
        Intrinsics.checkNotNullParameter(featureHandlerDelegate, "featureHandlerDelegate");
        this.f236523a = featureHandlerDelegate;
    }

    @Override // nhi.h, aii.p
    public final void b() {
        this.f236523a.getClass();
    }

    @Override // nte.a
    public final List e() {
        b60.f fVar = this.f236523a;
        return fVar instanceof nte.a ? ((nte.a) fVar).e() : f0.f322471a;
    }

    @Override // nhi.h
    public final void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        FeatureFlowStep featureStep;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AdapterDestination) {
            destination = ((AdapterDestination) destination).f98331b;
        }
        b bVar = this.f236523a;
        c cVarC = bVar.c(destination);
        if (cVarC == null || (featureStep = cVarC.a()) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(featureStep, "featureStep");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return bVar.a(featureStep, flowModel);
    }

    @Override // nhi.f
    public final u i(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof InternalDestination) {
            this.f236523a.c(destination);
        }
        return null;
    }
}
