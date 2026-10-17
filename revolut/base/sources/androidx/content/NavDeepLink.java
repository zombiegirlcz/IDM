package androidx.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.content.NavDeepLink;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.o;
import kotlin.text.q;
import ku9.b;
import org.jetbrains.annotations.NotNull;
import v0.a;
import yhm.j;
import yhm.k;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b(\u0018\u0000 \u0082\u00012\u00020\u0001:\b\u0083\u0001\u0084\u0001\u0085\u0001\u0082\u0001B'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001c\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010 \u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J1\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00022\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\n\u0010+\u001a\u00060)j\u0002`*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\n2\u000e\u0010&\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b3\u00102J;\u00106\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u00010\u00022\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b6\u00107J9\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u0002082\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b:\u0010;J=\u0010<\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b<\u0010=JG\u0010B\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020>2\u0006\u0010A\u001a\u00020@2\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\bB\u0010CJ5\u0010G\u001a\u00020,2\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bG\u0010HJ7\u0010I\u001a\u00020\n2\n\u00105\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010D\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020,H\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020@0MH\u0002¢\u0006\u0004\bN\u0010OJ#\u0010Q\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020'\u0012\u0004\u0012\u00020\u0002\u0018\u00010PH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020,H\u0002¢\u0006\u0004\bS\u0010LJ\u0013\u0010T\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\bT\u0010UR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bY\u0010XR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bZ\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u001d\u0010c\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001b\u0010e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\be\u0010fR'\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020@0M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010OR\u0016\u0010j\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR/\u0010n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020'\u0012\u0004\u0012\u00020\u0002\u0018\u00010P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010`\u001a\u0004\bm\u0010RR!\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010`\u001a\u0004\bp\u0010qR\u001d\u0010u\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010`\u001a\u0004\bt\u0010XR\u001d\u0010x\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010`\u001a\u0004\bw\u0010bR\u0018\u0010y\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010VR\u001d\u0010|\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010`\u001a\u0004\b{\u0010bR*\u0010}\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010k\u001a\u0004\b}\u0010f\"\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020>8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010q¨\u0006\u0086\u0001"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "", "matches$navigation_common_release", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "matches", "", "getMimeTypeMatchRating", "(Ljava/lang/String;)I", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "deepLink", "", "Landroidx/navigation/NavArgument;", "arguments", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "getMatchingArguments", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingPathAndQueryArgs", "requestedLink", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "calculateMatchingPathSegments", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "", "buildRegex", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "matchUri", "(Landroid/net/Uri;)Z", "matchAction", "(Ljava/lang/String;)Z", "matchMimeType", "fragment", "savedState", "getMatchingUriFragment", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Lkotlin/text/MatchResult;", "result", "getMatchingPathArguments", "(Lkotlin/text/MatchResult;Landroid/os/Bundle;Ljava/util/Map;)Z", "getMatchingQueryArguments", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Landroidx/navigation/NavDeepLink$ParamQuery;", "storedParam", "parseInputParams", "(Ljava/util/List;Landroidx/navigation/NavDeepLink$ParamQuery;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "parseArgument", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "parseArgumentForRepeatedParam", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)Z", "parsePath", "()V", "", "parseQuery", "()Ljava/util/Map;", "Lkotlin/Pair;", "parseFragment", "()Lkotlin/Pair;", "parseMime", "saveWildcardInRegex", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "getAction", "getMimeType", "pathArgs", "Ljava/util/List;", "pathRegex", "Lkotlin/text/Regex;", "pathPattern$delegate", "Lkotlin/Lazy;", "getPathPattern", "()Lkotlin/text/Regex;", "pathPattern", "isParameterizedQuery$delegate", "isParameterizedQuery", "()Z", "queryArgsMap$delegate", "getQueryArgsMap", "queryArgsMap", "isSingleQueryParamValueOnly", "Z", "fragArgsAndRegex$delegate", "getFragArgsAndRegex", "fragArgsAndRegex", "fragArgs$delegate", "getFragArgs", "()Ljava/util/List;", "fragArgs", "fragRegex$delegate", "getFragRegex", "fragRegex", "fragPattern$delegate", "getFragPattern", "fragPattern", "mimeTypeRegex", "mimeTypePattern$delegate", "getMimeTypePattern", "mimeTypePattern", "isExactDeepLink", "setExactDeepLink$navigation_common_release", "(Z)V", "getArgumentsNames$navigation_common_release", "argumentsNames", "Companion", "ParamQuery", "MimeType", "Builder", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavDeepLink {
    private final String action;

    /* JADX INFO: renamed from: fragArgs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragArgs;

    /* JADX INFO: renamed from: fragArgsAndRegex$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragArgsAndRegex;

    /* JADX INFO: renamed from: fragPattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragPattern;

    /* JADX INFO: renamed from: fragRegex$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragRegex;
    private boolean isExactDeepLink;

    /* JADX INFO: renamed from: isParameterizedQuery$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;

    /* JADX INFO: renamed from: mimeTypePattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mimeTypePattern;
    private String mimeTypeRegex;

    @NotNull
    private final List<String> pathArgs = new ArrayList();

    /* JADX INFO: renamed from: pathPattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pathPattern;
    private String pathRegex;

    /* JADX INFO: renamed from: queryArgsMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy queryArgsMap;
    private final String uriPattern;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Regex SCHEME_PATTERN = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    @NotNull
    private static final Regex FILL_IN_PATTERN = new Regex("\\{(.+?)\\}");

    @NotNull
    private static final Regex SCHEME_REGEX = new Regex("http[s]?://");

    @NotNull
    private static final Regex WILDCARD_REGEX = new Regex(".*");

    @NotNull
    private static final Regex PATH_REGEX = new Regex("([^/]*?|)");

    @NotNull
    private static final Regex QUERY_PATTERN = new Regex("^[^?#]+\\?([^#]*).*");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "uriPattern", "setUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", "action", "setAction", "mimeType", "setMimeType", "Landroidx/navigation/NavDeepLink;", "build", "()Landroidx/navigation/NavDeepLink;", "Ljava/lang/String;", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private String action;
        private String mimeType;
        private String uriPattern;

        @NotNull
        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @NotNull
        public final Builder setAction(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @NotNull
        public final Builder setUriPattern(@NotNull String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "<init>", "()V", "SCHEME_PATTERN", "Lkotlin/text/Regex;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "ANY_SYMBOLS_IN_THE_TAIL", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "compareTo", "(Landroidx/navigation/NavDeepLink$MimeType;)I", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "subType", "getSubType", "setSubType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MimeType implements Comparable<MimeType> {

        @NotNull
        private String subType;

        @NotNull
        private String type;

        public MimeType(@NotNull String mimeType) {
            List listV0;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List listK = new Regex("/").k(mimeType);
            if (listK.isEmpty()) {
                listV0 = f0.f322471a;
            } else {
                ListIterator listIterator = listK.listIterator(listK.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listV0 = d0.V0(listK, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listV0 = f0.f322471a;
            }
            this.type = (String) listV0.get(0);
            this.subType = (String) listV0.get(1);
        }

        @NotNull
        public final String getSubType() {
            return this.subType;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull MimeType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.f(this.type, other.type) ? 2 : 0;
            return Intrinsics.f(this.subType, other.subType) ? i + 1 : i;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "<init>", "()V", "", "name", "", "addArgumentName", "(Ljava/lang/String;)V", "paramRegex", "Ljava/lang/String;", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParamQuery {

        @NotNull
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.arguments.add(name);
        }

        @NotNull
        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        final int i = 0;
        this.pathPattern = j.b(new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i2 = 1;
        this.isParameterizedQuery = j.b(new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        k kVar = k.NONE;
        final int i3 = 2;
        this.queryArgsMap = j.c(kVar, new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i5 = 3;
        this.fragArgsAndRegex = j.c(kVar, new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i6 = 4;
        this.fragArgs = j.c(kVar, new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i21 = 5;
        this.fragRegex = j.c(kVar, new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i22 = 6;
        this.fragPattern = j.b(new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        final int i32 = 7;
        this.mimeTypePattern = j.b(new Function0(this) { // from class: o5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NavDeepLink f222304b;

            {
                this.f222304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return NavDeepLink.pathPattern_delegate$lambda$1(this.f222304b);
                    case 1:
                        return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f222304b));
                    case 2:
                        return this.f222304b.parseQuery();
                    case 3:
                        return this.f222304b.parseFragment();
                    case 4:
                        return NavDeepLink.fragArgs_delegate$lambda$5(this.f222304b);
                    case 5:
                        return NavDeepLink.fragRegex_delegate$lambda$6(this.f222304b);
                    case 6:
                        return NavDeepLink.fragPattern_delegate$lambda$8(this.f222304b);
                    default:
                        return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f222304b);
                }
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String uri2, List<String> args, StringBuilder uriRegex) {
        int i = 0;
        for (MatchResult matchResultB = FILL_IN_PATTERN.b(uri2); matchResultB != null; matchResultB = matchResultB.next()) {
            MatchGroup matchGroupA = matchResultB.b().a(1);
            Intrinsics.h(matchGroupA);
            args.add(matchGroupA.f187889a);
            if (matchResultB.getRange().f186448a > i) {
                Regex.Companion companion = Regex.INSTANCE;
                String strSubstring = uri2.substring(i, matchResultB.getRange().f186448a);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                companion.getClass();
                uriRegex.append(Regex.Companion.a(strSubstring));
            }
            String strPattern = PATH_REGEX.f187891a.pattern();
            Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
            uriRegex.append(strPattern);
            i = matchResultB.getRange().f186449b + 1;
        }
        if (i < uri2.length()) {
            Regex.Companion companion2 = Regex.INSTANCE;
            String strSubstring2 = uri2.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            companion2.getClass();
            uriRegex.append(Regex.Companion.a(strSubstring2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragArgs_delegate$lambda$5(NavDeepLink navDeepLink) {
        List list;
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.f186385a) == null) ? new ArrayList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex fragPattern_delegate$lambda$8(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new Regex(fragRegex, q.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fragRegex_delegate$lambda$6(NavDeepLink navDeepLink) {
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.f186386b;
        }
        return null;
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs.getValue();
    }

    private final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    private final Regex getFragPattern() {
        return (Regex) this.fragPattern.getValue();
    }

    private final String getFragRegex() {
        return (String) this.fragRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchingArguments$lambda$13(Bundle bundle, String argName) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        return !SavedStateReader.m3591containsimpl(SavedStateReader.m3590constructorimpl(bundle), argName);
    }

    private final boolean getMatchingPathArguments(MatchResult result, Bundle savedState, Map<String, NavArgument> arguments) {
        String str;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            String str2 = (String) obj2;
            MatchGroup matchGroupA = result.b().a(i2);
            if (matchGroupA != null && (str = matchGroupA.f187889a) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(str);
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(savedState, str2, strDecode, arguments.get(str2));
                arrayList.add(Unit.f186387a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri deepLink, Bundle savedState, Map<String, NavArgument> arguments) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !query.equals(deepLink.toString())) {
                queryParameters = u.c(query);
            }
            if (!parseInputParams(queryParameters, value, savedState, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String fragment, Bundle savedState, Map<String, NavArgument> arguments) {
        o oVarE;
        String str;
        Regex fragPattern = getFragPattern();
        if (fragPattern == null || (oVarE = fragPattern.e(String.valueOf(fragment))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(w.t(fragArgs, 10));
        int i = 0;
        for (Object obj2 : fragArgs) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                v.s();
                throw null;
            }
            String str2 = (String) obj2;
            MatchGroup matchGroupA = oVarE.f187921c.a(i2);
            if (matchGroupA != null && (str = matchGroupA.f187889a) != null) {
                strDecode = NavUriUtils.INSTANCE.decode(str);
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(savedState, str2, strDecode, arguments.get(str2));
                arrayList.add(Unit.f186387a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Regex getMimeTypePattern() {
        return (Regex) this.mimeTypePattern.getValue();
    }

    private final Regex getPathPattern() {
        return (Regex) this.pathPattern.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isParameterizedQuery_delegate$lambda$2(NavDeepLink navDeepLink) {
        String str = navDeepLink.uriPattern;
        return str != null && QUERY_PATTERN.f(str);
    }

    private final boolean matchAction(String action) {
        String str = this.action;
        if (str == null) {
            return true;
        }
        if (action == null) {
            return false;
        }
        return Intrinsics.f(str, action);
    }

    private final boolean matchMimeType(String mimeType) {
        if (this.mimeType == null) {
            return true;
        }
        if (mimeType == null) {
            return false;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        Intrinsics.h(mimeTypePattern);
        return mimeTypePattern.f(mimeType);
    }

    private final boolean matchUri(Uri uri2) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri2 == null) {
            return false;
        }
        Regex pathPattern = getPathPattern();
        Intrinsics.h(pathPattern);
        return pathPattern.f(uri2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex mimeTypePattern_delegate$lambda$10(NavDeepLink navDeepLink) {
        String str = navDeepLink.mimeTypeRegex;
        if (str != null) {
            return new Regex(str);
        }
        return null;
    }

    private final void parseArgument(Bundle savedState, String name, String value, NavArgument argument) {
        if (argument != null) {
            argument.getType().parseAndPut(savedState, name, value);
        } else {
            SavedStateWriter.m3630putStringimpl(SavedStateWriter.m3615constructorimpl(savedState), name, value);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle savedState, String name, String value, NavArgument argument) {
        if (!SavedStateReader.m3591containsimpl(SavedStateReader.m3590constructorimpl(savedState), name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        NavType<Object> type = argument.getType();
        type.parseAndPut(savedState, name, value, type.get(savedState, name));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str == null) {
            return null;
        }
        NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
        if (navUriUtils.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = navUriUtils.parse(this.uriPattern).getFragment();
        StringBuilder sb6 = new StringBuilder();
        Intrinsics.h(fragment);
        buildRegex(fragment, arrayList, sb6);
        return new Pair<>(arrayList, sb6.toString());
    }

    private final boolean parseInputParams(List<String> inputParams, ParamQuery storedParam, Bundle savedState, Map<String, NavArgument> arguments) {
        Object objValueOf;
        r0.g();
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        Iterator<T> it8 = storedParam.getArguments().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            NavArgument navArgument = arguments.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.getIsDefaultValuePresent()) {
                CollectionNavType collectionNavType = (CollectionNavType) type;
                collectionNavType.put(bundleBundleOf, str, collectionNavType.emptyCollection());
            }
        }
        for (String str2 : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            o oVarE = paramRegex != null ? new Regex(paramRegex).e(str2) : null;
            if (oVarE == null) {
                return false;
            }
            List<String> arguments2 = storedParam.getArguments();
            ArrayList arrayList = new ArrayList(w.t(arguments2, 10));
            int i = 0;
            for (Object obj2 : arguments2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String str3 = (String) obj2;
                MatchGroup matchGroupA = oVarE.f187921c.a(i2);
                String str4 = matchGroupA != null ? matchGroupA.f187889a : null;
                if (str4 == null) {
                    str4 = "";
                }
                NavArgument navArgument2 = arguments.get(str3);
                try {
                    if (SavedStateReader.m3591containsimpl(SavedStateReader.m3590constructorimpl(bundleBundleOf), str3)) {
                        objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, str4, navArgument2));
                    } else {
                        parseArgument(bundleBundleOf, str3, str4, navArgument2);
                        objValueOf = Unit.f186387a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = Unit.f186387a;
                }
                arrayList.add(objValueOf);
                i = i2;
            }
        }
        SavedStateWriter.m3616putAllimpl(SavedStateWriter.m3615constructorimpl(savedState), bundleBundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").f(this.mimeType)) {
            throw new IllegalArgumentException(a.i(new StringBuilder("The given mimeType "), this.mimeType, " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        StringBuilder sb6 = new StringBuilder("^(");
        sb6.append(mimeType.getType());
        sb6.append("|[*]+)/(");
        this.mimeTypeRegex = a0.D(a.i(sb6, mimeType.getSubType(), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("^");
        if (!SCHEME_PATTERN.a(this.uriPattern)) {
            String strPattern = SCHEME_REGEX.f187891a.pattern();
            Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
            sb6.append(strPattern);
        }
        o oVarB = new Regex("(\\?|#|$)").b(this.uriPattern);
        if (oVarB != null) {
            boolean z = false;
            String strSubstring = this.uriPattern.substring(0, oVarB.getRange().f186448a);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            buildRegex(strSubstring, this.pathArgs, sb6);
            if (!WILDCARD_REGEX.a(sb6) && !PATH_REGEX.a(sb6)) {
                z = true;
            }
            this.isExactDeepLink = z;
            sb6.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            String str = this.uriPattern;
            Intrinsics.h(str);
            Uri uri2 = navUriUtils.parse(str);
            for (String str2 : uri2.getQueryParameterNames()) {
                StringBuilder sb6 = new StringBuilder();
                List<String> queryParameters = uri2.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(a.i(com.google.android.gms.internal.mlkit_vision_face.a.x("Query parameter ", str2, " must only be present once in "), this.uriPattern, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) d0.d0(queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                ParamQuery paramQuery = new ParamQuery();
                int i = 0;
                for (MatchResult matchResultB = FILL_IN_PATTERN.b(str3); matchResultB != null; matchResultB = matchResultB.next()) {
                    MatchGroup matchGroupA = matchResultB.b().a(1);
                    Intrinsics.h(matchGroupA);
                    paramQuery.addArgumentName(matchGroupA.f187889a);
                    if (matchResultB.getRange().f186448a > i) {
                        String strSubstring = str3.substring(i, matchResultB.getRange().f186448a);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        Regex.INSTANCE.getClass();
                        sb6.append(Regex.Companion.a(strSubstring));
                    }
                    sb6.append("([\\s\\S]+?)?");
                    i = matchResultB.getRange().f186449b + 1;
                }
                if (i < str3.length()) {
                    Regex.Companion companion = Regex.INSTANCE;
                    String strSubstring2 = str3.substring(i);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    companion.getClass();
                    sb6.append(Regex.Companion.a(strSubstring2));
                }
                sb6.append("$");
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                paramQuery.setParamRegex(saveWildcardInRegex(string));
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex pathPattern_delegate$lambda$1(NavDeepLink navDeepLink) {
        String str = navDeepLink.pathRegex;
        if (str != null) {
            return new Regex(str, q.IGNORE_CASE);
        }
        return null;
    }

    private final String saveWildcardInRegex(String str) {
        return (kotlin.text.d0.J(str, "\\Q", false) && kotlin.text.d0.J(str, "\\E", false)) ? a0.D(str, ".*", "\\E.*\\Q", false) : kotlin.text.d0.J(str, "\\.\\*", false) ? a0.D(str, "\\.\\*", ".*", false) : str;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        return d0.h0(requestedLink.getPathSegments(), NavUriUtils.INSTANCE.parse(this.uriPattern).getPathSegments()).size();
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) other;
            if (Intrinsics.f(this.uriPattern, navDeepLink.uriPattern) && Intrinsics.f(this.action, navDeepLink.action) && Intrinsics.f(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> collectionValues = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((ParamQuery) it8.next()).getArguments(), arrayList);
        }
        return d0.E0(getFragArgs(), d0.E0(arrayList, list));
    }

    public final Bundle getMatchingArguments(@NotNull Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        o oVarE;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Regex pathPattern = getPathPattern();
        if (pathPattern == null || (oVarE = pathPattern.e(deepLink.toString())) == null) {
            return null;
        }
        r0.g();
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(oVarE, bundleBundleOf, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundleBundleOf, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundleBundleOf, arguments);
        if (NavArgumentKt.missingRequiredArguments(arguments, new b(1, bundleBundleOf)).isEmpty()) {
            return bundleBundleOf;
        }
        return null;
    }

    @NotNull
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        Regex pathPattern;
        o oVarE;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        r0.g();
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        SavedStateWriter.m3615constructorimpl(bundleBundleOf);
        if (deepLink != null && (pathPattern = getPathPattern()) != null && (oVarE = pathPattern.e(deepLink.toString())) != null) {
            getMatchingPathArguments(oVarE, bundleBundleOf, arguments);
            if (isParameterizedQuery()) {
                getMatchingQueryArguments(deepLink, bundleBundleOf, arguments);
            }
        }
        return bundleBundleOf;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getMimeTypeMatchRating(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        Intrinsics.h(mimeTypePattern);
        if (mimeTypePattern.f(mimeType)) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isExactDeepLink, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(@NotNull NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction()) && matchMimeType(deepLinkRequest.getMimeType());
    }
}
