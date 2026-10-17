package com.fourthline.core.internal.identifiers;

import android.content.Context;
import android.content.SharedPreferences;
import com.fourthline.core.internal.k0;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b'\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/fourthline/core/internal/identifiers/PersistedIdentifierProvider;", "Lcom/fourthline/core/internal/identifiers/IdentifierProvider;", "Landroid/content/Context;", "context", "", "key", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lkotlin/Lazy;", "getValue", "()Ljava/lang/String;", "value", "d", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PersistedIdentifierProvider implements IdentifierProvider {
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy value;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PersistedIdentifierProvider(@NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        this.context = context;
        this.key = key;
        this.value = j.b(new k0(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(PersistedIdentifierProvider persistedIdentifierProvider) {
        SharedPreferences sharedPreferences = persistedIdentifierProvider.context.getSharedPreferences("Analytics", 0);
        String string = sharedPreferences.getString(persistedIdentifierProvider.key, null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(persistedIdentifierProvider.key, string2).apply();
        Intrinsics.checkNotNullExpressionValue(string2, "also(...)");
        return string2;
    }

    @Override // com.fourthline.core.internal.identifiers.IdentifierProvider
    @NotNull
    public String getValue() {
        return (String) this.value.getValue();
    }
}
