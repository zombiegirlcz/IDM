package jte;

import com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178495a;

    static {
        int[] iArr = new int[ExperimentsFetchingInteractor$ExperimentType.values().length];
        try {
            iArr[ExperimentsFetchingInteractor$ExperimentType.FIREBASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentsFetchingInteractor$ExperimentType.SKYWALKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperimentsFetchingInteractor$ExperimentType.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f178495a = iArr;
    }
}
