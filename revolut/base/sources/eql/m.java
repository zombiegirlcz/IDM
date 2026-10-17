package eql;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f128512b;

    public /* synthetic */ m(c0 c0Var, int i) {
        this.f128511a = i;
        this.f128512b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f128511a) {
            case 0:
                hjl.c cVar = hjl.c.GOOGLE;
                c0 c0Var = this.f128512b;
                c0Var.h3(false, cVar, new b0(c0Var, null, 2));
                break;
            default:
                c0 c0Var2 = this.f128512b;
                Intent signInIntent = ((GoogleSignInClient) c0Var2.f128496s.f236195b.getValue()).getSignInIntent();
                Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
                c0Var2.A2(new ExternalDestination.ByIntent(signInIntent, 1998));
                break;
        }
        return Unit.f186387a;
    }
}
