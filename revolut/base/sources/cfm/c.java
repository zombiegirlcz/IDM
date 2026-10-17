package cfm;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23762b;

    public String a(Object obj2) {
        String string = obj2.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.f23762b + obj2;
        }
        throw new IllegalArgumentException(j6.a.q("Invalid key: ", string));
    }

    public String toString() {
        switch (this.f23761a) {
            case 3:
                return j6.a.u(new StringBuilder("<"), this.f23762b, '>');
            default:
                return super.toString();
        }
    }

    public c(String str, int i) {
        this.f23761a = i;
        switch (i) {
            case 3:
                this.f23762b = str;
                break;
            default:
                this.f23762b = str.concat("_");
                break;
        }
    }
}
