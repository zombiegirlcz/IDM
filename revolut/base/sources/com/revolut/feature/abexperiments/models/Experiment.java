package com.revolut.feature.abexperiments.models;

import android.os.Parcelable;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r81.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/abexperiments/models/Experiment;", "Landroid/os/Parcelable;", "Companion", "a", "feature_ab_experiments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Experiment extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f60552a;

    /* JADX INFO: renamed from: com.revolut.feature.abexperiments.models.Experiment$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60552a = new Companion();

        private Companion() {
        }
    }

    Set Q8();

    c X1();

    c getDefaultValue();

    String w7();
}
