package wc;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f296296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f296297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f296298c;

    public m(FileChannel fileChannel, long j2, long j3) {
        this.f296296a = fileChannel;
        this.f296297b = j2;
        this.f296298c = j3;
    }

    @Override // wc.e
    public final void a(MessageDigest[] messageDigestArr, long j2, int i) throws IOException {
        MappedByteBuffer map = this.f296296a.map(FileChannel.MapMode.READ_ONLY, this.f296297b + j2, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // wc.e
    public final long zza() {
        return this.f296298c;
    }
}
