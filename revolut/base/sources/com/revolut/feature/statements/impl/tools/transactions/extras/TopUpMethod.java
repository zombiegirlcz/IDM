package com.revolut.feature.statements.impl.tools.transactions.extras;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.internal.d;
import efm.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class TopUpMethod {
    public static final TopUpMethod EXTERNAL_CARD = new AnonymousClass1();
    public static final TopUpMethod EXTERNAL_ACCOUNT = new AnonymousClass2();
    public static final TopUpMethod EXTERNAL_BENEFICIARY = new AnonymousClass3();
    public static final TopUpMethod UNKNOWN = new AnonymousClass4();
    private static final /* synthetic */ TopUpMethod[] $VALUES = $values();

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod$1, reason: invalid class name */
    public enum AnonymousClass1 extends TopUpMethod {
        public /* synthetic */ AnonymousClass1() {
            this("EXTERNAL_CARD", 0);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod
        @NonNull
        public String getAlias() {
            return "EXTERNAL_CARD";
        }

        private AnonymousClass1(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod$2, reason: invalid class name */
    public enum AnonymousClass2 extends TopUpMethod {
        public /* synthetic */ AnonymousClass2() {
            this("EXTERNAL_ACCOUNT", 1);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod
        @NonNull
        public String getAlias() {
            return "EXTERNAL_ACCOUNT";
        }

        private AnonymousClass2(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod$3, reason: invalid class name */
    public enum AnonymousClass3 extends TopUpMethod {
        public /* synthetic */ AnonymousClass3() {
            this("EXTERNAL_BENEFICIARY", 2);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod
        @NonNull
        public String getAlias() {
            return "EXTERNAL_BENEFICIARY";
        }

        private AnonymousClass3(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod$4, reason: invalid class name */
    public enum AnonymousClass4 extends TopUpMethod {
        public /* synthetic */ AnonymousClass4() {
            this("UNKNOWN", 3);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.extras.TopUpMethod
        @NonNull
        public String getAlias() {
            return "UNKNOWN";
        }

        private AnonymousClass4(String str, int i) {
            super(str, i, 0);
        }
    }

    private static /* synthetic */ TopUpMethod[] $values() {
        return new TopUpMethod[]{EXTERNAL_CARD, EXTERNAL_ACCOUNT, EXTERNAL_BENEFICIARY, UNKNOWN};
    }

    public /* synthetic */ TopUpMethod(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$parse$0(String str, TopUpMethod topUpMethod) throws Exception {
        return topUpMethod.getAlias().equalsIgnoreCase(str);
    }

    public static TopUpMethod parse(String str) {
        return TextUtils.isEmpty(str) ? UNKNOWN : (TopUpMethod) r.fromArray(values()).filter(new d(str, 7)).blockingFirst(UNKNOWN);
    }

    public static TopUpMethod valueOf(String str) {
        return (TopUpMethod) Enum.valueOf(TopUpMethod.class, str);
    }

    public static TopUpMethod[] values() {
        return (TopUpMethod[]) $VALUES.clone();
    }

    @NonNull
    public abstract String getAlias();

    private TopUpMethod(String str, int i) {
    }
}
