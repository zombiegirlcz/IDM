package com.revolut.feature.statements.impl.tools.transactions;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TransactionsFilter extends Filter<TransactionDbModel> implements Serializable {
    private Boolean allZeroAmountsRemove;
    public String currentCurrency;
    private Boolean isHidden;
    public long maxDate;
    public long minDate;
    private Boolean negativeAmount;
    public String pocketId;
    public TransactionSource source;
    public TransactionState state;
    public List<TransactionState> states;
    public String transactionId;
    public TransactionType type;
    private List<TransactionType> types;

    public TransactionsFilter() {
        this.transactionId = null;
        this.currentCurrency = null;
        this.pocketId = null;
        this.minDate = Long.MIN_VALUE;
        this.maxDate = Long.MAX_VALUE;
        this.type = null;
        this.state = null;
        this.source = null;
        this.negativeAmount = null;
        this.allZeroAmountsRemove = null;
        this.isHidden = Boolean.TRUE;
    }

    @NonNull
    public TransactionsFilter copy() {
        return new TransactionsFilter().setCurrentCurrency(this.currentCurrency).setMaxDate(Long.valueOf(this.maxDate)).setMinDate(Long.valueOf(this.minDate)).setNegativeAmount(this.negativeAmount).setSource(this.source).setState(this.state).setType(this.type).isHidden(this.isHidden);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof TransactionsFilter)) {
            return super.equals(obj2);
        }
        TransactionsFilter transactionsFilter = (TransactionsFilter) obj2;
        String str = this.currentCurrency;
        String str2 = transactionsFilter.currentCurrency;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        String str3 = this.pocketId;
        String str4 = transactionsFilter.pocketId;
        if ((str3 != str4 && (str3 == null || !str3.equals(str4))) || this.minDate != transactionsFilter.minDate || this.maxDate != transactionsFilter.maxDate) {
            return false;
        }
        TransactionType transactionType = this.type;
        TransactionType transactionType2 = transactionsFilter.type;
        if (transactionType != transactionType2) {
            return transactionType != null && transactionType.equals(transactionType2);
        }
        return true;
    }

    @Override // com.revolut.feature.statements.impl.tools.transactions.Filter
    @NonNull
    public List<TransactionDbModel> filter(List<TransactionDbModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (TransactionDbModel transactionDbModel : list) {
                if (isPass(transactionDbModel)) {
                    arrayList.add(transactionDbModel);
                }
            }
        }
        return arrayList;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    @NonNull
    public TransactionsFilter isHidden(Boolean bool) {
        this.isHidden = bool;
        return this;
    }

    @NonNull
    public TransactionsFilter setCurrentCurrency(String str) {
        this.currentCurrency = str;
        return this;
    }

    @NonNull
    public TransactionsFilter setMaxDate(Long l2) {
        this.maxDate = l2 != null ? l2.longValue() : Long.MAX_VALUE;
        return this;
    }

    @NonNull
    public TransactionsFilter setMinDate(Long l2) {
        this.minDate = l2 != null ? l2.longValue() : Long.MIN_VALUE;
        return this;
    }

    @NonNull
    public TransactionsFilter setNegativeAmount(Boolean bool) {
        this.negativeAmount = bool;
        return this;
    }

    @NonNull
    public TransactionsFilter setPocketId(String str) {
        this.pocketId = str;
        return this;
    }

    @NonNull
    public TransactionsFilter setSource(TransactionSource transactionSource) {
        this.source = transactionSource;
        return this;
    }

    @NonNull
    public TransactionsFilter setState(TransactionState transactionState) {
        this.state = transactionState;
        return this;
    }

    @NonNull
    public TransactionsFilter setStates(List<TransactionState> list) {
        this.states = list;
        return this;
    }

    @NonNull
    public TransactionsFilter setTransactionId(String str) {
        this.transactionId = str;
        return this;
    }

    @NonNull
    public TransactionsFilter setType(TransactionType transactionType) {
        this.type = transactionType;
        return this;
    }

    @NonNull
    public TransactionsFilter setTypes(List<TransactionType> list) {
        this.types = list;
        return this;
    }

    @Override // com.revolut.feature.statements.impl.tools.transactions.Filter
    public boolean isPass(@NonNull TransactionDbModel transactionDbModel) {
        TransactionType transactionType;
        String accountId;
        String str;
        if (transactionDbModel.getState() == TransactionState.FAILED && (transactionDbModel.getType() == TransactionType.TOPUP || transactionDbModel.getType() == TransactionType.TRANSFER)) {
            transactionDbModel.setState(TransactionState.DECLINED);
        }
        TransactionState transactionState = transactionDbModel.state;
        boolean z = false;
        if (transactionState != null && TransactionState.PENDING != transactionState && TransactionState.REVERTED != transactionState && TransactionState.COMPLETED != transactionState && TransactionState.DECLINED != transactionState) {
            return false;
        }
        TransactionState transactionState2 = this.state;
        if (transactionState2 != null && transactionState != null && !transactionState.equals(transactionState2)) {
            return false;
        }
        List<TransactionState> list = this.states;
        if (list != null && list.size() > 0 && transactionDbModel.state != null) {
            Iterator<TransactionState> it8 = this.states.iterator();
            while (it8.hasNext()) {
                if (transactionDbModel.state.equals(it8.next())) {
                }
            }
            return false;
        }
        if (this.transactionId != null && (transactionDbModel.getSid() == null || !transactionDbModel.getSid().equals(this.transactionId))) {
            return false;
        }
        String str2 = this.currentCurrency;
        if (str2 != null && ((str = transactionDbModel.pocketCcy) == null || !str.equals(str2))) {
            return false;
        }
        if (this.pocketId != null && (accountId = TransactionExtraAttrsUtil.getAccountId(transactionDbModel)) != null && !TextUtils.equals(accountId, this.pocketId)) {
            return false;
        }
        TransactionType transactionType2 = this.type;
        if (transactionType2 != null && ((transactionType = transactionDbModel.type) == null || transactionType != transactionType2)) {
            return false;
        }
        List<TransactionType> list2 = this.types;
        if (list2 != null && list2.size() > 0 && transactionDbModel.type != null) {
            Iterator<TransactionType> it9 = this.types.iterator();
            while (it9.hasNext()) {
                if (transactionDbModel.type.equals(it9.next())) {
                }
            }
            return false;
        }
        Long l2 = transactionDbModel.startedDate;
        if (l2 != null && l2.longValue() >= this.minDate) {
            if (transactionDbModel.startedDate.longValue() > this.maxDate) {
                return false;
            }
            Boolean bool = this.negativeAmount;
            if (bool != null) {
                if (bool.booleanValue() && transactionDbModel.getAmount().getAmount() > 0) {
                    return false;
                }
                if (!this.negativeAmount.booleanValue() && transactionDbModel.getAmount().getAmount() < 0) {
                    return false;
                }
            }
            Boolean bool2 = this.allZeroAmountsRemove;
            if (bool2 != null && bool2.booleanValue() && transactionDbModel.getAmount().getAmount() == 0) {
                return false;
            }
            z = true;
            if (this.isHidden.booleanValue()) {
                return !transactionDbModel.getIsUserHidden();
            }
        }
        return z;
    }

    public TransactionsFilter(@NonNull TransactionsFilter transactionsFilter) {
        this.transactionId = null;
        this.currentCurrency = null;
        this.pocketId = null;
        this.minDate = Long.MIN_VALUE;
        this.maxDate = Long.MAX_VALUE;
        this.type = null;
        this.state = null;
        this.source = null;
        this.negativeAmount = null;
        this.allZeroAmountsRemove = null;
        this.isHidden = Boolean.TRUE;
        this.currentCurrency = transactionsFilter.currentCurrency;
        this.pocketId = transactionsFilter.pocketId;
        this.type = transactionsFilter.type;
        this.minDate = transactionsFilter.minDate;
        this.maxDate = transactionsFilter.maxDate;
    }
}
