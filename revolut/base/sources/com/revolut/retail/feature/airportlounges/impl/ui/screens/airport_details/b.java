package com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a;
import hxi.f;
import iii.c;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tvh.e;
import uw2.n;
import uwi.k;
import uwi.o;
import uwi.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportDetailsScreenContract$InputData f99035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f99036b;

    public b(AirportDetailsScreenContract$InputData inputData, f loungeListItemBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loungeListItemBuilder, "loungeListItemBuilder");
        this.f99035a = inputData;
        this.f99036b = loungeListItemBuilder;
    }

    @Override // jki.p
    public final m a(i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = (Clause) c.f(domainState.f283675a, new uv1.c(27), new utk.b(13), new n(2));
        Data data = domainState.f283676b;
        return new o(clause, !this.f99035a.f99031b ? a.c.f99034a : (a) c.f(t1.t(domainState.d, data), new uv1.c(28), new utk.b(14), new n(3)), (List) c.f(data, new uv1.c(this), new utk.b(15), new e(this, domainState, 15)));
    }
}
