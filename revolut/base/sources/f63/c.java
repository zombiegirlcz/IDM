package f63;

import android.nfc.tech.IsoDep;
import com.github.devnied.emvnfccard.exception.CommunicationException;
import com.github.devnied.emvnfccard.parser.IProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class c implements IProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IsoDep f132400a;

    @Override // com.github.devnied.emvnfccard.parser.IProvider
    public final byte[] getAt() {
        return new byte[0];
    }

    @Override // com.github.devnied.emvnfccard.parser.IProvider
    public final byte[] transceive(byte[] bArr) throws CommunicationException {
        try {
            return this.f132400a.transceive(bArr);
        } catch (IOException e) {
            throw new CommunicationException(e.getMessage());
        }
    }
}
