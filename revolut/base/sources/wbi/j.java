package wbi;

import cli.n;
import cli.y;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements dli.b {
    public final zzl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PersonalCodeContract$InputData f296227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f296228q;

    public j(n stateMapper, zzl.b regexMatcher, PersonalCodeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = regexMatcher;
        this.f296227p = inputData;
        this.f296228q = mra.d.b(this, new a("", inputData.f97706b, inputData.f97707c, false, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f296228q;
    }
}
