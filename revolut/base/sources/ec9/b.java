package ec9;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import q89.e;
import qd9.c;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements u89.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc9.b f124476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f124477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f124478c;
    public final l93.a d;
    public final cha.a e;

    public b(dc9.b operationPromptsProvider, e onboardingInteractor, f revolutCardInteractor, l93.a cardsImageInteractor, cha.a creditPlansInteractor) {
        Intrinsics.checkNotNullParameter(operationPromptsProvider, "operationPromptsProvider");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(revolutCardInteractor, "revolutCardInteractor");
        Intrinsics.checkNotNullParameter(cardsImageInteractor, "cardsImageInteractor");
        Intrinsics.checkNotNullParameter(creditPlansInteractor, "creditPlansInteractor");
        this.f124476a = operationPromptsProvider;
        this.f124477b = onboardingInteractor;
        this.f124478c = revolutCardInteractor;
        this.d = cardsImageInteractor;
        this.e = creditPlansInteractor;
    }

    public final i a(c operationType, NaviCommand defaultCommand) {
        Intrinsics.checkNotNullParameter(operationType, "operationType");
        Intrinsics.checkNotNullParameter(defaultCommand, "defaultCommand");
        i iVar = new i(new i(d0.m(operationType), new e8h.c(21, new e1.b(operationType, this, 27)), 0), new e8h.c(22, new a(defaultCommand, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
