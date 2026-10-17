package a5;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import android.view.Window;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import aw0.y9;
import ce.f;
import ce.g;
import ce.p;
import ce.v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import de.m;
import gc.h;
import ix0.p1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kfm.o;
import kotlin.jvm.internal.Intrinsics;
import le.e1;
import le.g1;
import le.o2;
import le.t0;
import le.w0;
import nwl.l;
import s7.e;
import zb.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, e, g, cf.a, Continuation, ze.a, ij0.b, f, h, Id3Decoder.FramePredicate, p1, CacheKeyFactory, od0.f, ListenerSet.Event, me.a, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1296a;

    public /* synthetic */ a(int i) {
        this.f1296a = i;
    }

    @Override // od0.f
    public void accept(Object obj2) {
        ((l) obj2).l();
    }

    @Override // gc.h, kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f1296a) {
            case 16:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj2).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        jpf.a aVarA = j.a();
                        aVarA.x(cursorRawQuery.getString(1));
                        aVarA.f177269c = jc.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        aVarA.f177268b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(aVarA.j());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 28:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
        }
        return Boolean.FALSE;
    }

    @Override // cf.a
    public void b(cf.b bVar) {
    }

    @Override // me.a
    public Object c(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        switch (this.f1296a) {
            case 24:
                e1 e1Var = new e1();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "parameterKey":
                            String strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            e1Var.f194255b = strNextString2;
                            break;
                            break;
                        case "templateVersion":
                            e1Var.d = jsonReader.nextLong();
                            e1Var.e = (byte) (e1Var.e | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString3 = null;
                            String strNextString4 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                strNextName2.getClass();
                                if (strNextName2.equals("variantId")) {
                                    strNextString4 = jsonReader.nextString();
                                    if (strNextString4 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (strNextName2.equals("rolloutId")) {
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString3 != null && strNextString4 != null) {
                                e1Var.f194254a = new g1(strNextString3, strNextString4);
                                break;
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                if (strNextString3 == null) {
                                    sb6.append(" rolloutId");
                                }
                                if (strNextString4 == null) {
                                    sb6.append(" variantId");
                                }
                                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
                            }
                            break;
                        case "parameterValue":
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            e1Var.f194256c = strNextString5;
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return e1Var.a();
            case 25:
                jsonReader.beginObject();
                List listD = null;
                byte b4 = 0;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "frames":
                            listD = me.b.d(jsonReader, new a(27));
                            if (listD == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                            break;
                            break;
                        case "name":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case "importance":
                            iNextInt = jsonReader.nextInt();
                            b4 = (byte) (b4 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b4 == 1 && strNextString != null && listD != null) {
                    return new w0(iNextInt, strNextString, listD);
                }
                StringBuilder sb9 = new StringBuilder();
                if (strNextString == null) {
                    sb9.append(" name");
                }
                if ((b4 & 1) == 0) {
                    sb9.append(" importance");
                }
                if (listD == null) {
                    sb9.append(" frames");
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb9));
            case 26:
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                byte b5 = 0;
                long jNextLong = 0;
                long jNextLong2 = 0;
                while (jsonReader.hasNext()) {
                    String strNextName4 = jsonReader.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "name":
                            String strNextString6 = jsonReader.nextString();
                            if (strNextString6 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str = strNextString6;
                            break;
                            break;
                        case "size":
                            b5 = (byte) (b5 | 2);
                            jNextLong2 = jsonReader.nextLong();
                            break;
                        case "uuid":
                            str2 = new String(Base64.decode(jsonReader.nextString(), 2), o2.f194358a);
                            break;
                        case "baseAddress":
                            b5 = (byte) (b5 | 1);
                            jNextLong = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b5 == 3 && str != null) {
                    return new t0(str, str2, jNextLong, jNextLong2);
                }
                StringBuilder sb10 = new StringBuilder();
                if ((b5 & 1) == 0) {
                    sb10.append(" baseAddress");
                }
                if ((b5 & 2) == 0) {
                    sb10.append(" size");
                }
                if (str == null) {
                    sb10.append(" name");
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb10));
            default:
                return me.b.a(jsonReader);
        }
    }

    @Override // ce.g
    public List e(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i5, int i6) {
        return Mp3Extractor.lambda$static$1(i, i2, i3, i5, i6);
    }

    @Override // ix0.p1
    public void f(Object obj2, Context context) {
        Window window;
        y9 style = (y9) obj2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activityI = z92.f.i(context);
        if (activityI == null || (window = activityI.getWindow()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        style.b(context, window);
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        switch (this.f1296a) {
            case 0:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // s7.e
    public Object getValue() {
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((Player.Listener) obj2).onRenderedFirstFrame();
    }

    @Override // ce.f
    public Object m(v vVar) {
        switch (this.f1296a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.f49442a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f49444c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f49443b.get();
            case 11:
                p pVar = ExecutorsRegistrar.f49442a;
                return m.INSTANCE;
            case 12:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(vVar);
            case 13:
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(vVar);
            case 14:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(vVar);
            case 15:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(vVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        switch (this.f1296a) {
            case 5:
                return -1;
            default:
                if (task.isSuccessful()) {
                    ie.b bVar = (ie.b) task.getResult();
                    fe.c cVar = fe.c.f134428a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f160508b);
                    File file = bVar.f160509c;
                    z = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.f("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    task.getException();
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ a(oe.c cVar) {
        this.f1296a = 18;
    }
}
