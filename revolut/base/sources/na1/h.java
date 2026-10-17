package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f213682a = v0.a.d("create(...)");

    public final void a() {
        this.f213682a.onNext(Unit.f186387a);
    }

    public abstract efm.b b(PairingInfo pairingInfo);
}
