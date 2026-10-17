package me;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jul.o;
import kx7.o0;
import le.a0;
import le.a1;
import le.b0;
import le.c0;
import le.d0;
import le.e0;
import le.g0;
import le.i1;
import le.j0;
import le.k1;
import le.l0;
import le.n0;
import le.o2;
import le.u0;
import le.x0;
import le.y0;
import le.z0;
import xe.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wif.a f204589a;

    static {
        d dVar = new d();
        a0.f194196a.configure(dVar);
        dVar.d = true;
        f204589a = new wif.a(dVar);
    }

    public static y0 a(JsonReader jsonReader) throws IOException {
        x0 x0Var = new x0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    x0Var.d = jsonReader.nextLong();
                    x0Var.f = (byte) (x0Var.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    x0Var.f194413b = strNextString;
                    break;
                    break;
                case "pc":
                    x0Var.f194412a = jsonReader.nextLong();
                    x0Var.f = (byte) (x0Var.f | 1);
                    break;
                case "file":
                    x0Var.f194414c = jsonReader.nextString();
                    break;
                case "importance":
                    x0Var.e = jsonReader.nextInt();
                    x0Var.f = (byte) (x0Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return x0Var.a();
    }

    public static g0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new g0(strNextString, strNextString2);
        }
        StringBuilder sb6 = new StringBuilder();
        if (strNextString == null) {
            sb6.append(" key");
        }
        if (strNextString2 == null) {
            sb6.append(" value");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    public static e0 c(JsonReader jsonReader) throws IOException {
        d0 d0Var = new d0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    d0Var.b(d(jsonReader, new o0(9)));
                    break;
                case "pid":
                    d0Var.d(jsonReader.nextInt());
                    break;
                case "pss":
                    d0Var.f(jsonReader.nextLong());
                    break;
                case "rss":
                    d0Var.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    d0Var.i(jsonReader.nextLong());
                    break;
                case "processName":
                    d0Var.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    d0Var.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    d0Var.j(jsonReader.nextString());
                    break;
                case "importance":
                    d0Var.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d0Var.a();
    }

    public static List d(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.c(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static le.q0 e(android.util.JsonReader r28) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.b.e(android.util.JsonReader):le.q0");
    }

    public static u0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        u0 u0VarF = null;
        byte b4 = 0;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b4 == 1 && str != null && list != null) {
                    return new u0(str, strNextString, list, u0VarF, iNextInt);
                }
                StringBuilder sb6 = new StringBuilder();
                if (str == null) {
                    sb6.append(" type");
                }
                if (list == null) {
                    sb6.append(" frames");
                }
                if ((b4 & 1) == 0) {
                    sb6.append(" overflowCount");
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new a5.a(27));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    u0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b4 = (byte) (b4 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static a1 g(JsonReader jsonReader) throws IOException {
        z0 z0Var = new z0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    z0Var.f194424b = jsonReader.nextInt();
                    z0Var.e = (byte) (z0Var.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    z0Var.f194423a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    z0Var.d = jsonReader.nextBoolean();
                    z0Var.e = (byte) (z0Var.e | 4);
                    break;
                case "importance":
                    z0Var.f194425c = jsonReader.nextInt();
                    z0Var.e = (byte) (z0Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z0Var.a();
    }

    public static c0 h(JsonReader jsonReader) throws IOException {
        int i;
        Charset charset = o2.f194358a;
        b0 b0Var = new b0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i = 10;
            switch (strNextName) {
                case "ndkPayload":
                    o oVar = new o();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            oVar.s(d(jsonReader, new o0(i)));
                        } else if (strNextName2.equals("orgId")) {
                            oVar.t(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    b0Var.k = oVar.d();
                    continue;
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    b0Var.f194206a = strNextString;
                    break;
                    break;
                case "appQualitySessionId":
                    b0Var.f194209g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    b0Var.f194212l = c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    b0Var.f194210h = strNextString2;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    b0Var.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    b0Var.f194207b = strNextString3;
                    break;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    b0Var.d = strNextString4;
                    break;
                    break;
                case "firebaseInstallationId":
                    b0Var.e = jsonReader.nextString();
                    break;
                case "platform":
                    b0Var.f194208c = jsonReader.nextInt();
                    b0Var.f194213m = (byte) (b0Var.f194213m | 1);
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    b0Var.i = strNextString5;
                    break;
                    break;
                case "session":
                    j0 j0Var = new j0();
                    j0Var.f = false;
                    j0Var.f194305m = (byte) (j0Var.f194305m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                j0Var.d = jsonReader.nextLong();
                                j0Var.f194305m = (byte) (j0Var.f194305m | 1);
                                break;
                            case "appQualitySessionId":
                                j0Var.f194300c = jsonReader.nextString();
                                break;
                            case "identifier":
                                j0Var.f194299b = new String(Base64.decode(jsonReader.nextString(), 2), o2.f194358a);
                                break;
                            case "endedAt":
                                j0Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                n0 n0Var = new n0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            n0Var.f = jsonReader.nextBoolean();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            n0Var.f194344h = strNextString6;
                                            break;
                                            break;
                                        case "ram":
                                            n0Var.d = jsonReader.nextLong();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 4);
                                            break;
                                        case "arch":
                                            n0Var.f194340a = jsonReader.nextInt();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 1);
                                            break;
                                        case "diskSpace":
                                            n0Var.e = jsonReader.nextLong();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 8);
                                            break;
                                        case "cores":
                                            n0Var.f194342c = jsonReader.nextInt();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 2);
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            n0Var.f194341b = strNextString7;
                                            break;
                                            break;
                                        case "state":
                                            n0Var.f194343g = jsonReader.nextInt();
                                            n0Var.f194345j = (byte) (n0Var.f194345j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            n0Var.i = strNextString8;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                j0Var.f194303j = n0Var.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                j0Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                i1 i1Var = new i1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            i1Var.f194289c = strNextString9;
                                            break;
                                            break;
                                        case "jailbroken":
                                            i1Var.d = jsonReader.nextBoolean();
                                            i1Var.e = (byte) (i1Var.e | 2);
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            i1Var.f194288b = strNextString10;
                                            break;
                                            break;
                                        case "platform":
                                            i1Var.f194287a = jsonReader.nextInt();
                                            i1Var.e = (byte) (i1Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                j0Var.i = i1Var.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String str = null;
                                String str2 = null;
                                String strNextString11 = null;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            String strNextString15 = jsonReader.nextString();
                                            if (strNextString15 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            str = strNextString15;
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            String strNextString16 = jsonReader.nextString();
                                            if (strNextString16 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            str2 = strNextString16;
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString12 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString11 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str != null && str2 != null) {
                                    j0Var.f194301g = new l0(str, str2, strNextString11, strNextString12, strNextString13, strNextString14);
                                    break;
                                } else {
                                    StringBuilder sb6 = new StringBuilder();
                                    if (str == null) {
                                        sb6.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb6.append(" version");
                                    }
                                    throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString17 = jsonReader.nextString();
                                        if (strNextString17 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                j0Var.f194302h = new k1(strNextString17);
                                break;
                                break;
                            case "generator":
                                String strNextString18 = jsonReader.nextString();
                                if (strNextString18 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                j0Var.f194298a = strNextString18;
                                break;
                                break;
                            case "crashed":
                                j0Var.f = jsonReader.nextBoolean();
                                j0Var.f194305m = (byte) (j0Var.f194305m | 2);
                                break;
                            case "generatorType":
                                j0Var.f194304l = jsonReader.nextInt();
                                j0Var.f194305m = (byte) (j0Var.f194305m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    b0Var.f194211j = j0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b0Var.a();
    }

    public static c0 i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                c0 c0VarH = h(jsonReader);
                jsonReader.close();
                return c0VarH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
