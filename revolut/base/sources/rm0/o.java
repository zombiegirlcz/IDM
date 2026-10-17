package rm0;

import com.youTransactor.uCube.rpc.Constants;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f255164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f255165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f255166c;
    public static final String d;

    public static final class a {
        private a() {
        }
    }

    static {
        Charset charset = Charsets.UTF_8;
        f255164a = new String("RSA".getBytes(), charset);
        f255165b = new String(new byte[]{69, 67, CVCAFile.CAR_TAG}, charset);
        f255166c = new String(new byte[]{80, 75, 67, 83, Constants.INQUIRY, 80, 97, ISOFileInfo.FMD_BYTE, ISOFileInfo.FMD_BYTE, 105, 110, 103}, charset);
        d = new String(new byte[]{79, 65, 69, 80, 80, 97, ISOFileInfo.FMD_BYTE, ISOFileInfo.FMD_BYTE, 105, 110, 103}, charset);
    }

    public final Cipher a(r version, int i, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String strP;
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(key, "key");
        int[] iArr = p.f255167a;
        int i2 = iArr[version.ordinal()];
        String str = f255165b;
        String str2 = f255164a;
        if (i2 == 1) {
            strP = com.google.android.gms.internal.mlkit_vision_face.a.p(str2, "/", str, "/", f255166c);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strP = com.google.android.gms.internal.mlkit_vision_face.a.p(str2, "/", str, "/", d);
        }
        Cipher cipher = Cipher.getInstance(strP);
        int i3 = iArr[version.ordinal()];
        if (i3 == 1) {
            cipher.init(i, key);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cipher.init(i, key, new OAEPParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
        }
        Intrinsics.h(cipher);
        return cipher;
    }
}
