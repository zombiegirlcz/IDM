package ymm;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final anm.a f315065a;

    static {
        anm.f fVar = new anm.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = anm.d.i;
        anm.b[] bVarArr = {new anm.f((String[][]) strArr.clone())};
        anm.b[] bVarArr2 = new anm.b[2];
        bVarArr2[0] = fVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 1, 1);
        anm.a aVar = new anm.a(bVarArr2);
        anm.b[] bVarArr3 = {new anm.e(0)};
        anm.b[] bVarArr4 = new anm.b[2];
        bVarArr4[0] = aVar;
        System.arraycopy(bVarArr3, 0, bVarArr4, 1, 1);
        f315065a = new anm.a(new anm.b[]{new anm.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new anm.f((String[][]) strArr.clone()), new anm.e(0)});
        String[][] strArr2 = anm.d.e;
        anm.f fVar2 = new anm.f((String[][]) strArr2.clone());
        String[][] strArr3 = anm.d.f7827g;
        anm.f fVar3 = new anm.f((String[][]) strArr2.clone());
        String[][] strArr4 = anm.d.f7824a;
        new anm.a(new anm.b[]{new anm.i(0), new anm.i(1), new anm.f((String[][]) anm.d.f7829j.clone()), new anm.f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = anm.d.f;
        anm.f fVar4 = new anm.f((String[][]) strArr5.clone());
        String[][] strArr6 = anm.d.f7825b;
    }

    public static final String a(String str) {
        anm.a aVar = f315065a;
        aVar.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iA = aVar.a(str, iCharCount, stringWriter);
                if (iA == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iA; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
