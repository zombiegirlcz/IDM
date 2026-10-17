package k50;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.tracking.v3.ChatContext;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f181067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MessagesScreen f181068c;
    public final View d;
    public final py0.f e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f181069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v0 f181070h;
    public c1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f181071j;
    public int k;

    public g(String str, UUID uuid, MessagesScreen analyticsContextHolder, View view, py0.f userActionsHandler, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsContextHolder, "analyticsContextHolder");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(userActionsHandler, "userActionsHandler");
        this.f181066a = str;
        this.f181067b = uuid;
        this.f181068c = analyticsContextHolder;
        this.d = view;
        this.e = userActionsHandler;
        this.f = z;
        this.f181069g = j6.a.p("toString(...)");
    }

    public final void a() {
        String strValueOf;
        String str;
        this.k++;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ChatContext.a aVarNewBuilder = ChatContext.newBuilder();
        aVarNewBuilder.c();
        ((ChatContext) aVarNewBuilder.f49761b).setInstanceId(this.f181069g);
        c1 c1Var = null;
        String str2 = this.f181066a;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                aVarNewBuilder.c();
                ((ChatContext) aVarNewBuilder.f49761b).setEntryPoint(str2);
            }
        }
        UUID uuid = this.f181067b;
        if (uuid != null) {
            String strValueOf2 = String.valueOf(uuid);
            aVarNewBuilder.c();
            ((ChatContext) aVarNewBuilder.f49761b).setTicketId(strValueOf2);
        }
        v0 v0Var = this.f181070h;
        if (v0Var != null) {
            int i = f.f181060a[v0Var.ordinal()];
            if (i == 1) {
                str = "suggestions";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "chat";
            }
            aVarNewBuilder.c();
            ((ChatContext) aVarNewBuilder.f49761b).setCurrentState(str);
        }
        c1 c1Var2 = this.i;
        if (c1Var2 != null) {
            if (c1Var2.f181041b == this.f181070h && !c1Var2.f181040a.isEmpty()) {
                c1Var = c1Var2;
            }
            if (c1Var != null) {
                List list = c1Var.f181040a;
                kg.r rVar = new kg.r();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ChatPromptSuggestion chatPromptSuggestion = (ChatPromptSuggestion) list.get(i2);
                    Clause clause = chatPromptSuggestion.f51533c;
                    if (clause instanceof TextClause) {
                        strValueOf = ((TextClause) clause).f57936a;
                    } else if (clause instanceof TextLocalisedClause) {
                        ResourceId resourceId = ((TextLocalisedClause) clause).f57940a;
                        if (resourceId instanceof ResourceId.StringResourceId) {
                            strValueOf = ((ResourceId.StringResourceId) resourceId).f57935a;
                        } else {
                            if (!(resourceId instanceof ResourceId.IntResourceId)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strValueOf = String.valueOf(((ResourceId.IntResourceId) resourceId).f57934a);
                        }
                    } else {
                        strValueOf = "";
                    }
                    kg.w wVar = new kg.w();
                    wVar.h("id", chatPromptSuggestion.f51531a);
                    wVar.h("text", strValueOf);
                    rVar.g(wVar);
                }
                String string = rVar.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                aVarNewBuilder.c();
                ((ChatContext) aVarNewBuilder.f49761b).setSuggestionsShown(string);
            }
        }
        com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        companion.getClass();
        this.f181068c.L = new AnalyticsContext(AnalyticsContext.Companion.a((ChatContext) w0VarA));
        this.e.i(this.d, String.valueOf(this.k));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r2.i == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2.i == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r2.f181071j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(k50.v0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pane"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            k50.v0 r0 = r2.f181070h
            if (r0 != r3) goto La
            return
        La:
            boolean r0 = r2.f181071j
            if (r0 == 0) goto L14
            r0 = 0
            r2.f181071j = r0
            r2.a()
        L14:
            r2.f181070h = r3
            int[] r0 = k50.f.f181060a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L33
            r1 = 2
            if (r3 != r1) goto L2d
            boolean r3 = r2.f
            if (r3 == 0) goto L3a
            k50.c1 r3 = r2.i
            if (r3 != 0) goto L3a
            goto L37
        L2d:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L33:
            k50.c1 r3 = r2.i
            if (r3 != 0) goto L3a
        L37:
            r2.f181071j = r0
            return
        L3a:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.g.b(k50.v0):void");
    }
}
