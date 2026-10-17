package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/statements/api/models/StubStatementsContent;", "", "<init>", "()V", "statementContent", "Lcom/revolut/feature/statements/api/models/StatementContent;", "getStatementContent", "()Lcom/revolut/feature/statements/api/models/StatementContent;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StubStatementsContent {

    @NotNull
    public static final StubStatementsContent INSTANCE = new StubStatementsContent();

    @NotNull
    private static final StatementContent statementContent = new StatementContent("+44 20 3322 8352", "© 2019 Revolut Ltd\nRevolut Ltd (No. 08804411) is authorised by the Financial Conduct Authority under the Electronic Money Regulations 2011 (Firm Reference 900562). Registered address: 9th Floor 107 Cheapside, London, EC2V 6DN, United Kingdom. Revolut Ltd is an Appointed Representative of Lending Works Ltd (for the activity of “operating an electronic system for lending” only) and Thornbridge Investment Management LLP (for the purposes of designated investment business only).", "*This cryptocurrency exchange was performed by Paxos Trust Company, LLC (\"Exchanger\"). If you did not initiate this transaction, or if you wish to dispute this order, you must contact the Exchanger at help@itbit.com or (855) 997-2994 within three (3) days. We ask that you clearly specify why and what you are disputing of your order. Finally, you understand and agree that the Exchanger and Revolut assume no responsibility whatsoever in orders that were erroneously placed by you. Please see terms and conditions for more information. If the exchange includes a currency other than USD, the currency selected was exchanged with USD to complete the transaction with the Exchanger. The rate shown is applicable to the transaction.", "Revolut Technologies Inc. is a Delaware Software Company with its registered address at Corporation Trust Center, 1209 Orange Street, Wilmington, New Castle County, Delaware 19801. Banking services are provided by Metropolitan Commercial Bank, Member FDIC. The Revolut USA Mastercard is issued by Metropolitan Commercial Bank pursuant to a license from Mastercard International and may be used everywhere Mastercard is accepted in the U.S. “Metropolitan Commercial Bank” and “Metropolitan” are registered trademarks of Metropolitan Commercial Bank. Mastercard is a registered trademark, and the circles design is a trademark of Mastercard International Incorporated.", "10M+");

    private StubStatementsContent() {
    }

    @NotNull
    public final StatementContent getStatementContent() {
        return statementContent;
    }
}
