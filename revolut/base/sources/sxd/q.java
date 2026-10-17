package sxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.jvm.functions.Function1;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupMethod.StoredMethod f266444b;

    public /* synthetic */ q(TopupMethod.StoredMethod storedMethod, int i) {
        this.f266443a = i;
        this.f266444b = storedMethod;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f266443a) {
        }
        return g.a((g) obj2, this.f266444b, null, null, null, null, false, ISO781611.SMT_TAG);
    }
}
