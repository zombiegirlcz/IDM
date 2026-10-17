package com.revolut.feature.statements.impl.tools.transactions;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.internal.d;
import efm.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class TransactionState {
    public static final TransactionState PENDING = new AnonymousClass1();
    public static final TransactionState COMPLETED = new AnonymousClass2();
    public static final TransactionState REVERTED = new AnonymousClass3();
    public static final TransactionState DECLINED = new AnonymousClass4();
    public static final TransactionState CANCELLED = new AnonymousClass5();
    public static final TransactionState FAILED = new AnonymousClass6();
    public static final TransactionState RECORDED = new AnonymousClass7();
    public static final TransactionState CREATED = new AnonymousClass8();
    public static final TransactionState UNKNOWN = new AnonymousClass9();
    private static final /* synthetic */ TransactionState[] $VALUES = $values();

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$1, reason: invalid class name */
    public enum AnonymousClass1 extends TransactionState {
        public /* synthetic */ AnonymousClass1() {
            this("PENDING", 0);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "PENDING";
        }

        private AnonymousClass1(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$2, reason: invalid class name */
    public enum AnonymousClass2 extends TransactionState {
        public /* synthetic */ AnonymousClass2() {
            this("COMPLETED", 1);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "COMPLETED";
        }

        private AnonymousClass2(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$3, reason: invalid class name */
    public enum AnonymousClass3 extends TransactionState {
        public /* synthetic */ AnonymousClass3() {
            this("REVERTED", 2);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "REVERTED";
        }

        private AnonymousClass3(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$4, reason: invalid class name */
    public enum AnonymousClass4 extends TransactionState {
        public /* synthetic */ AnonymousClass4() {
            this("DECLINED", 3);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "DECLINED";
        }

        private AnonymousClass4(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$5, reason: invalid class name */
    public enum AnonymousClass5 extends TransactionState {
        public /* synthetic */ AnonymousClass5() {
            this("CANCELLED", 4);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "CANCELLED";
        }

        private AnonymousClass5(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$6, reason: invalid class name */
    public enum AnonymousClass6 extends TransactionState {
        public /* synthetic */ AnonymousClass6() {
            this("FAILED", 5);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "FAILED";
        }

        private AnonymousClass6(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$7, reason: invalid class name */
    public enum AnonymousClass7 extends TransactionState {
        public /* synthetic */ AnonymousClass7() {
            this("RECORDED", 6);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "RECORDED";
        }

        private AnonymousClass7(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$8, reason: invalid class name */
    public enum AnonymousClass8 extends TransactionState {
        public /* synthetic */ AnonymousClass8() {
            this("CREATED", 7);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "CREATED";
        }

        private AnonymousClass8(String str, int i) {
            super(str, i, 0);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.tools.transactions.TransactionState$9, reason: invalid class name */
    public enum AnonymousClass9 extends TransactionState {
        public /* synthetic */ AnonymousClass9() {
            this("UNKNOWN", 8);
        }

        @Override // com.revolut.feature.statements.impl.tools.transactions.TransactionState
        @NonNull
        public String getAlias() {
            return "UNKNOWN";
        }

        private AnonymousClass9(String str, int i) {
            super(str, i, 0);
        }
    }

    private static /* synthetic */ TransactionState[] $values() {
        return new TransactionState[]{PENDING, COMPLETED, REVERTED, DECLINED, CANCELLED, FAILED, RECORDED, CREATED, UNKNOWN};
    }

    public /* synthetic */ TransactionState(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$parse$0(String str, TransactionState transactionState) throws Exception {
        return transactionState.getAlias().equalsIgnoreCase(str);
    }

    @NonNull
    public static TransactionState parse(String str) {
        return TextUtils.isEmpty(str) ? UNKNOWN : (TransactionState) r.fromArray(values()).filter(new d(str, 4)).blockingFirst(UNKNOWN);
    }

    public static TransactionState valueOf(String str) {
        return (TransactionState) Enum.valueOf(TransactionState.class, str);
    }

    public static TransactionState[] values() {
        return (TransactionState[]) $VALUES.clone();
    }

    @NonNull
    public abstract String getAlias();

    private TransactionState(String str, int i) {
    }
}
