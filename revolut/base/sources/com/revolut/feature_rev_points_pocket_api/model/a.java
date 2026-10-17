package com.revolut.feature_rev_points_pocket_api.model;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final RevPointsPocketInfo a(RevPointsPocketState revPointsPocketState) {
        Intrinsics.checkNotNullParameter(revPointsPocketState, "<this>");
        RevPointsPocketState.Active active = revPointsPocketState instanceof RevPointsPocketState.Active ? (RevPointsPocketState.Active) revPointsPocketState : null;
        if (active != null) {
            return active.f97790b;
        }
        return null;
    }
}
