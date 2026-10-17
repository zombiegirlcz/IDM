package oy7;

import kotlin.jvm.internal.Intrinsics;
import sx7.d;
import vx7.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f230910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f230911b;

    public a(c petBaseDetailsBuilder, qx7.a petAgeUIBuilder, d petBreedDetailsUIBuilder) {
        Intrinsics.checkNotNullParameter(petBaseDetailsBuilder, "petBaseDetailsBuilder");
        Intrinsics.checkNotNullParameter(petAgeUIBuilder, "petAgeUIBuilder");
        Intrinsics.checkNotNullParameter(petBreedDetailsUIBuilder, "petBreedDetailsUIBuilder");
        this.f230910a = petBaseDetailsBuilder;
        this.f230911b = petBreedDetailsUIBuilder;
    }
}
