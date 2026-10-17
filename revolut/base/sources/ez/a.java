package ez;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    @NotNull
    public static final C0764a Companion = new C0764a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f130877a;

    /* JADX INFO: renamed from: ez.a$a, reason: collision with other inner class name */
    public static final class C0764a {
        private C0764a() {
        }
    }

    static {
        List listK = v.k("bg", "cs", "da", "de", "el", "en", "es", "fi", "fr", "hr", "hu", "it", "ja", "lt", "lv", "nb", "nl", "pl", "pt", "ro", "ru", "sk", "sv", "uk");
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(Locale.forLanguageTag((String) it8.next()));
        }
        f130877a = arrayList;
    }
}
