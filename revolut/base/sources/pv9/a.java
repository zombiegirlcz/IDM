package pv9;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import java.io.Serializable;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240013a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f240014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240015c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(d dVar, PublicKey publicKey, PrivateKey privateKey, String str, byte[] bArr) {
        this.f240015c = dVar;
        this.d = publicKey;
        this.e = privateKey;
        this.f240014b = str;
        this.f = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f240013a) {
            case 0:
                d dVar = (d) this.f240015c;
                PublicKey publicKey = (PublicKey) this.d;
                PrivateKey privateKey = (PrivateKey) this.e;
                return dVar.f240018a.b((byte[]) this.f, dVar.i(this.f240014b, privateKey, publicKey));
            default:
                sv9.c cVar = (sv9.c) this.f240015c;
                String str = (String) this.d;
                KeyPair keyPair = (KeyPair) this.e;
                String str2 = (String) this.f;
                if (str == null) {
                    str = "";
                }
                cv9.a aVar = cVar.f265858b;
                PublicKey key = keyPair.getPublic();
                Intrinsics.checkNotNullExpressionValue(key, "getPublic(...)");
                d dVar2 = (d) aVar;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                f fVar = dVar2.f240018a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                MessageType.Key key2 = new MessageType.Key(com.google.android.gms.internal.mlkit_vision_face.a.o(fVar.d.e(key), ":", str));
                String strValueOf = String.valueOf(DateTimeUtils.currentTimeMillis());
                String strName = key2.getF79540a().name();
                return new iv9.a(strValueOf, str2, this.f240014b, key2.getF79545b(), strName, false, Long.MAX_VALUE, Long.MAX_VALUE, dv9.d.SENDING.getId(), dv9.d.SENT.getId(), null);
        }
    }

    public /* synthetic */ a(sv9.c cVar, String str, String str2, KeyPair keyPair, String str3) {
        this.f240015c = cVar;
        this.f240014b = str;
        this.d = str2;
        this.e = keyPair;
        this.f = str3;
    }
}
