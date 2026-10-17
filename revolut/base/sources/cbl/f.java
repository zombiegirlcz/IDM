package cbl;

import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f22896p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, QuestionScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22896p = new b(inputData.f105015a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f22896p;
    }
}
