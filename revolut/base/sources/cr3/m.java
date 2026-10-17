package cr3;

import hs3.a1;
import hs3.b1;
import hs3.c1;
import hs3.d1;
import hs3.e1;
import hs3.f1;
import hs3.g1;
import hs3.h1;
import hs3.i1;
import hs3.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class m {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static i1 a(String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1689277618:
                    if (str.equals("SHOW_REGISTERS")) {
                        return h1.f154894a;
                    }
                    break;
                case -1337079887:
                    if (str.equals("RESTART_APP")) {
                        return g1.f154890a;
                    }
                    break;
                case -1133820697:
                    if (str.equals("NEW_APPLICATION_FTC")) {
                        return d1.f154877a;
                    }
                    break;
                case 135062769:
                    if (str.equals("NEW_APPLICATION")) {
                        return c1.f154874a;
                    }
                    break;
                case 177592649:
                    if (str.equals("CLOSE_APPLICATION")) {
                        return y0.f154974a;
                    }
                    break;
                case 379609712:
                    if (str.equals("CONTACT_SUPPORT")) {
                        return a1.f154863a;
                    }
                    break;
                case 393753166:
                    if (str.equals("NOTIFY_ME")) {
                        return e1.f154883a;
                    }
                    break;
                case 1072298787:
                    if (str.equals("PERSONAL_DETAILS")) {
                        return f1.f154888a;
                    }
                    break;
                case 1411860198:
                    if (str.equals("DEEPLINK")) {
                        if (str2 != null) {
                            return new b1(str2);
                        }
                        throw new IllegalArgumentException("Deeplink must not be null");
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(j6.a.q("This rejection action is not supported: ", str));
    }
}
