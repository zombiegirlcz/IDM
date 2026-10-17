package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.si;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a50 implements ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f26706a;

    public a50(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        this.f26706a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(kd1 intent, si.e error, String source, Function0 retryBlock) {
        ee1 cVar;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        fe1 fe1Var = this.f26706a;
        er erVarA = error.a();
        if (Intrinsics.f(erVarA, er.a.f28230a) || Intrinsics.f(erVarA, er.e.f28238a) || Intrinsics.f(erVarA, er.d.f28236a)) {
            cVar = io.a.e.f29653a;
        } else if (Intrinsics.f(erVarA, er.g.f28242a) || Intrinsics.f(erVarA, er.i.f28246a)) {
            cVar = io.a.b.f29650a;
        } else {
            if (!Intrinsics.f(erVarA, er.j.f28248a)) {
                if (!Intrinsics.f(erVarA, er.f.f28240a) && !Intrinsics.f(erVarA, er.c.f28234a) && !Intrinsics.f(erVarA, er.b.f28232a) && !Intrinsics.f(erVarA, er.h.f28244a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Document PostProcessing doesn't handle this error: " + error).toString());
            }
            cVar = new io.a.c(error);
        }
        fe1Var.b(cVar);
    }

    @Override // com.fourthline.orca.internal.ww
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(kd1 intent, si.e error, String source, Function0 retryBlock) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(retryBlock, "retryBlock");
        er erVarA = error.a();
        if (!Intrinsics.f(erVarA, er.j.f28248a) && !Intrinsics.f(erVarA, er.d.f28236a)) {
            this.f26706a.b(new io.a.c(error));
            return;
        }
        throw new IllegalStateException(("The " + error + " state should not have a secondary button").toString());
    }
}
