package v9;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends p0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i) {
        super(ByteBuffer.class);
        this.d = i;
        switch (i) {
            case 1:
                super(InetSocketAddress.class);
                break;
            case 2:
                super(String.class);
                break;
            case 3:
                super(TimeZone.class);
                break;
            default:
                break;
        }
    }

    public static void r(InetSocketAddress inetSocketAddress, com.fasterxml.jackson.core.h hVar) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        StringBuilder sbL = v0.a.l(hostName, ":");
        sbL.append(inetSocketAddress.getPort());
        hVar.B(sbL.toString());
    }

    @Override // v9.p0, k9.k
    public boolean d(k9.v vVar, Object obj2) {
        switch (this.d) {
            case 2:
                return ((String) obj2).isEmpty();
            default:
                return super.d(vVar, obj2);
        }
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        switch (this.d) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                if (byteBuffer.hasArray()) {
                    int iPosition = byteBuffer.position();
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
                    int iLimit = byteBuffer.limit() - iPosition;
                    hVar.getClass();
                    hVar.j(com.fasterxml.jackson.core.c.f26164a, bArrArray, iArrayOffset, iLimit);
                    return;
                }
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                if (byteBufferAsReadOnlyBuffer.position() > 0) {
                    byteBufferAsReadOnlyBuffer.rewind();
                }
                x9.c cVar = new x9.c(byteBufferAsReadOnlyBuffer);
                int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                hVar.getClass();
                com.fasterxml.jackson.core.b bVar = com.fasterxml.jackson.core.c.f26164a;
                g9.c cVar2 = (g9.c) hVar;
                char c2 = cVar2.f141421m;
                f9.d dVar = cVar2.f;
                cVar2.E("write a binary value");
                int i = cVar2.f141423p;
                int i2 = cVar2.f141424q;
                if (i >= i2) {
                    cVar2.I();
                }
                char[] cArr = cVar2.f141422n;
                int i3 = cVar2.f141423p;
                cVar2.f141423p = i3 + 1;
                cArr[i3] = c2;
                byte[] bArr = (byte[]) dVar.f;
                j9.a aVar = (j9.a) dVar.d;
                if (bArr != null) {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
                aVar.getClass();
                int i5 = j9.a.f172245c[3];
                if (i5 <= 0) {
                    i5 = 0;
                }
                byte[] bArr2 = (byte[]) aVar.f172246a.getAndSet(3, null);
                if (bArr2 == null || bArr2.length < i5) {
                    bArr2 = new byte[i5];
                }
                dVar.f = bArr2;
                try {
                    if (iRemaining < 0) {
                        cVar2.N(bVar, cVar, bArr2);
                    } else {
                        int iO = cVar2.O(bVar, cVar, bArr2, iRemaining);
                        if (iO > 0) {
                            cVar2.d("Too few bytes available: missing " + iO + " bytes (out of " + iRemaining + ")");
                            throw null;
                        }
                    }
                    byte[] bArr3 = (byte[]) dVar.f;
                    if (bArr2 != bArr3 && bArr2.length < bArr3.length) {
                        throw new IllegalArgumentException("Trying to release buffer smaller than original");
                    }
                    dVar.f = null;
                    aVar.f172246a.set(3, bArr2);
                    if (cVar2.f141423p >= i2) {
                        cVar2.I();
                    }
                    char[] cArr2 = cVar2.f141422n;
                    int i6 = cVar2.f141423p;
                    cVar2.f141423p = i6 + 1;
                    cArr2[i6] = c2;
                    cVar.close();
                    return;
                } catch (Throwable th10) {
                    byte[] bArr4 = (byte[]) dVar.f;
                    if (bArr2 != bArr4 && bArr2.length < bArr4.length) {
                        throw new IllegalArgumentException("Trying to release buffer smaller than original");
                    }
                    dVar.f = null;
                    aVar.f172246a.set(3, bArr2);
                    throw th10;
                }
            case 1:
                r((InetSocketAddress) obj2, hVar);
                return;
            case 2:
                hVar.B((String) obj2);
                return;
            default:
                hVar.B(((TimeZone) obj2).getID());
                return;
        }
    }

    @Override // v9.p0, k9.k
    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        switch (this.d) {
            case 1:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj2;
                f9.d dVarD = cVar.d(inetSocketAddress, com.fasterxml.jackson.core.n.VALUE_STRING);
                dVarD.f132797c = InetSocketAddress.class;
                f9.d dVarE = cVar.e(hVar, dVarD);
                r(inetSocketAddress, hVar);
                cVar.f(hVar, dVarE);
                break;
            case 2:
                hVar.B((String) obj2);
                break;
            case 3:
                TimeZone timeZone = (TimeZone) obj2;
                f9.d dVarD2 = cVar.d(timeZone, com.fasterxml.jackson.core.n.VALUE_STRING);
                dVarD2.f132797c = TimeZone.class;
                f9.d dVarE2 = cVar.e(hVar, dVarD2);
                hVar.B(timeZone.getID());
                cVar.f(hVar, dVarE2);
                break;
            default:
                super.h(obj2, hVar, vVar, cVar);
                break;
        }
    }
}
