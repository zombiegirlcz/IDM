package ye;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ve.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f312737a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f312738b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve.b f312739c;
    public final g d;

    public i(g gVar) {
        this.d = gVar;
    }

    @Override // ve.f
    public final ve.f add(String str) {
        if (this.f312737a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f312737a = true;
        this.d.d(this.f312739c, str, this.f312738b);
        return this;
    }

    @Override // ve.f
    public final ve.f add(boolean z) {
        if (!this.f312737a) {
            this.f312737a = true;
            this.d.b(this.f312739c, z ? 1 : 0, this.f312738b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
