package cnm;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f25476b;

    public String toString() {
        switch (this.f25475a) {
            case 0:
                Pattern[] patternArr = (Pattern[]) this.f25476b;
                StringBuilder sb6 = new StringBuilder("RegexValidator{");
                for (int i = 0; i < patternArr.length; i++) {
                    if (i > 0) {
                        sb6.append(",");
                    }
                    sb6.append(patternArr[i].pattern());
                }
                sb6.append("}");
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.util.regex.Pattern[]] */
    public c(String str) {
        this.f25475a = 0;
        String[] strArr = {str};
        this.f25476b = new Pattern[1];
        for (int i = 0; i < 1; i++) {
            String str2 = strArr[i];
            if (str2 == null || str2.length() == 0) {
                throw new IllegalArgumentException(j6.a.l(i, "Regular expression[", "] is missing"));
            }
            ((Pattern[]) this.f25476b)[i] = Pattern.compile(strArr[i], 0);
        }
    }
}
