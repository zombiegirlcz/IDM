package i41;

import com.revolut.ProtectedRevolutApplication;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a extends q implements Function0 {
    public static final a f = new a();

    public a() {
        super(0, ProtectedRevolutApplication.BuildConfig.class, "kill", "kill()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProtectedRevolutApplication.BuildConfig.csFdb();
        return Unit.f186387a;
    }
}
