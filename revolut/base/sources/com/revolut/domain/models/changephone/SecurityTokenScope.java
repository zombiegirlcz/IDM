package com.revolut.domain.models.changephone;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/changephone/SecurityTokenScope;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "CHANGE_PHONE", "RESET_PASSWORD", "CONFIRM_SCOPED_SIGNIN", "SECURITY_ANSWERS_SUBMIT", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityTokenScope {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityTokenScope[] $VALUES;
    public static final SecurityTokenScope CHANGE_PHONE;
    public static final SecurityTokenScope CONFIRM_SCOPED_SIGNIN;
    public static final SecurityTokenScope RESET_PASSWORD;
    public static final SecurityTokenScope SECURITY_ANSWERS_SUBMIT;

    @NotNull
    private static final Map<String, SecurityTokenScope> mapping;

    private static final /* synthetic */ SecurityTokenScope[] $values() {
        return new SecurityTokenScope[]{CHANGE_PHONE, RESET_PASSWORD, CONFIRM_SCOPED_SIGNIN, SECURITY_ANSWERS_SUBMIT};
    }

    static {
        SecurityTokenScope securityTokenScope = new SecurityTokenScope("CHANGE_PHONE", 0);
        CHANGE_PHONE = securityTokenScope;
        SecurityTokenScope securityTokenScope2 = new SecurityTokenScope("RESET_PASSWORD", 1);
        RESET_PASSWORD = securityTokenScope2;
        SecurityTokenScope securityTokenScope3 = new SecurityTokenScope("CONFIRM_SCOPED_SIGNIN", 2);
        CONFIRM_SCOPED_SIGNIN = securityTokenScope3;
        SecurityTokenScope securityTokenScope4 = new SecurityTokenScope("SECURITY_ANSWERS_SUBMIT", 3);
        SECURITY_ANSWERS_SUBMIT = securityTokenScope4;
        SecurityTokenScope[] securityTokenScopeArr$values = $values();
        $VALUES = securityTokenScopeArr$values;
        $ENTRIES = s.n(securityTokenScopeArr$values);
        INSTANCE = new Companion();
        mapping = r0.k(new Pair("CHANGE_PHONE", securityTokenScope), new Pair("RESET_PASSWORD", securityTokenScope2), new Pair("CONFIRM_SCOPED_SIGNIN", securityTokenScope3), new Pair("SECURITY_ANSWERS_SUBMIT", securityTokenScope4));
    }

    private SecurityTokenScope(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SecurityTokenScope valueOf(String str) {
        return (SecurityTokenScope) Enum.valueOf(SecurityTokenScope.class, str);
    }

    public static SecurityTokenScope[] values() {
        return (SecurityTokenScope[]) $VALUES.clone();
    }
}
