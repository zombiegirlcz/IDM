package f30;

import com.revolut.chat.data.repository.chat.ChatMessageMarkdownException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.x;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;
import zsc.p;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f131874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f131875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f131876c;
    public final n50.b d;

    public k(o gson, x chatMessageTextMapper, f01.a uiKitResources, n50.b chatMessagePreviewExtractor) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(chatMessageTextMapper, "chatMessageTextMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(chatMessagePreviewExtractor, "chatMessagePreviewExtractor");
        this.f131874a = gson;
        this.f131875b = chatMessageTextMapper;
        this.f131876c = uiKitResources;
        this.d = chatMessagePreviewExtractor;
    }

    public static void a(String str, StringBuilder sb6) {
        if (str == null || d0.W(str)) {
            return;
        }
        if (sb6.length() > 0) {
            sb6.append(p.SPACE_CHAR);
        }
        sb6.append(str);
    }

    public final String b(UUID uuid, boolean z, String... strArr) {
        StringBuilder sb6 = new StringBuilder();
        for (String str : strArr) {
            a(str, sb6);
        }
        String string = sb6.toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            return d(string, uuid, z);
        }
        return null;
    }

    public final String c(int i) {
        return this.f131876c.b(new TextLocalisedClause(i, null, null, 14)).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(String str, UUID uuid, boolean z) throws Exception {
        try {
            if (z) {
                String strE = this.f131875b.e(str);
                boolean zW = d0.W(strE);
                uuid = zW;
                if (!zW) {
                    return strE;
                }
            } else {
                boolean zW2 = d0.W(str);
                if (!zW2) {
                    return str;
                }
                uuid = zW2;
            }
            return null;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            ChatMessageMarkdownException chatMessageMarkdownException = new ChatMessageMarkdownException("SearchTextExtractor", string, e);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SearchTextExtractorMarkdownException", null, chatMessageMarkdownException, h0Var);
            return null;
        }
    }
}
