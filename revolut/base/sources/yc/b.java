package yc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import smd.s;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ecm.c f312399c = new ecm.c("LocalTestingConfigParser", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f312400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f312401b;

    public b(XmlPullParser xmlPullParser) {
        this.f312400a = xmlPullParser;
        c cVar = c.f312402c;
        s sVar = new s();
        sVar.f264433b = new HashMap();
        this.f312401b = sVar;
    }

    public static c a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return c.f312402c;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                b bVar = new b(xmlPullParserNewPullParser);
                bVar.b("local-testing-config", new ugc.a(bVar, 21));
                c cVarB0 = bVar.f312401b.b0();
                fileReader.close();
                return cVarB0;
            } catch (Throwable th10) {
                try {
                    fileReader.close();
                } catch (Throwable th11) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th10, th11);
                    } catch (Exception unused) {
                    }
                }
                throw th10;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            f312399c.f("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return c.f312402c;
        }
    }

    public final void b(String str, h hVar) {
        while (true) {
            XmlPullParser xmlPullParser = this.f312400a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(j6.a.s("Expected '", str, "' tag but found '", xmlPullParser.getName(), "'."), xmlPullParser, null);
                }
                hVar.mo3809zza();
            }
        }
    }
}
