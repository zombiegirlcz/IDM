package cam;

import android.util.JsonReader;
import android.util.JsonToken;
import android.webkit.ValueCallback;
import java.io.IOException;
import java.io.StringReader;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eim.c f22683a;

    public l(eim.c cVar) {
        this.f22683a = cVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj2) {
        String str = (String) obj2;
        String strNextString = null;
        if (str != null) {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(true);
            try {
                strNextString = jsonReader.peek() == JsonToken.STRING ? jsonReader.nextString() : jsonReader.toString();
            } catch (IOException unused) {
            } catch (Throwable th10) {
                try {
                    jsonReader.close();
                } catch (IOException unused2) {
                }
                throw th10;
            }
            try {
                jsonReader.close();
            } catch (IOException unused3) {
            }
        }
        m.Companion companion = yhm.m.INSTANCE;
        this.f22683a.resumeWith(strNextString);
    }
}
