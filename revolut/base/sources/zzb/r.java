package zzb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f326663a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPointsPersonalisationPreferencesResponse it8 = (RevPointsPersonalisationPreferencesResponse) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new j(it8);
    }
}
