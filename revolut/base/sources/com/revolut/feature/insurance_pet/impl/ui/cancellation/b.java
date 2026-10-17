package com.revolut.feature.insurance_pet.impl.ui.cancellation;

import an.f;
import an.g;
import an.h;
import an.k;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.j;
import pfm.z;
import zh9.u0;
import zx7.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements mm.b, k {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an.a f76243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f76244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f08.a f76245c;
    public final f08.e d;

    public b(an.a promptDialogDispatcher, ln.a navigationCommandsDispatcher, f08.a presentationModel, f08.e state) {
        Intrinsics.checkNotNullParameter(promptDialogDispatcher, "promptDialogDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f76243a = promptDialogDispatcher;
        this.f76244b = navigationCommandsDispatcher;
        this.f76245c = presentationModel;
        this.d = state;
    }

    @Override // an.k
    public final d0 a(f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean z = callback instanceof g;
        ln.a aVar = this.f76244b;
        an.a aVar2 = this.f76243a;
        if (z) {
            Object obj2 = ((g) callback).f6505a.f256150a;
            if (!(obj2 instanceof CancellationPromptActionHandler$PetParcel)) {
                throw new IllegalStateException("Pet parcel should be provided");
            }
            j jVarK = aVar2.c0(new an.b()).k(300L, TimeUnit.MILLISECONDS, hhm.f.f152430b);
            CancellationPromptActionHandler$PetParcel cancellationPromptActionHandler$PetParcel = (CancellationPromptActionHandler$PetParcel) obj2;
            by7.k.Companion.getClass();
            return jVarK.e(aVar.a(new ActivityNavigateCommand(by7.g.f19774b, new CancellationFeedbackScreenContract$Configuration.CancelPolicy((String) ((f08.k) this.d).y0().get(), cancellationPromptActionHandler$PetParcel.f76239a, cancellationPromptActionHandler$PetParcel.f76240b, cancellationPromptActionHandler$PetParcel.f76241c), null, null, 0, null, null, null, null, false, 1020))).D(Boolean.TRUE);
        }
        if (callback instanceof h) {
            z zVarD = aVar2.c0(new an.b()).k(300L, TimeUnit.MILLISECONDS, hhm.f.f152430b).e(aVar.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)))).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        zx7.h action = (zx7.h) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        d0 d0VarFirstOrError = m70.a.g(((f08.h) this.f76245c).l3(), null, null, 3).firstOrError();
        zx0.b bVar = new zx0.b(new a(this), 12);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, bVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
