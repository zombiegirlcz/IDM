package gcm;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f142597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142599c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((ecm.z) this.f142597a.get(this.f142598b)).f124900a.get(this.f142599c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (c()) {
            ecm.z zVar = (ecm.z) this.f142597a.get(this.f142598b);
            int i = this.f142599c + 1;
            this.f142599c = i;
            if (i >= zVar.f124900a.size()) {
                int i2 = this.f142598b + 1;
                this.f142598b = i2;
                this.f142599c = 0;
                if (i2 < this.f142597a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f142598b < this.f142597a.size();
    }

    public void d() {
        this.f142598b = 0;
        this.f142599c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i = 0; i < this.f142597a.size(); i++) {
            int iIndexOf = ((ecm.z) this.f142597a.get(i)).f124900a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f142598b = i;
                this.f142599c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
